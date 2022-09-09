// ------------------------------------------------------
// NOTE! This solution doesn't work in it's current state
// ------------------------------------------------------

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();


        for(int i = 0; i < n; i++) {
            String line = s.nextLine();
            char[] charArray = line.toCharArray();
            LinkedList<Character> backLinkedList = new LinkedList<>();
            LinkedList<Character> frontLinkedList = new LinkedList<>();
            LinkedList<Character> finalLinkedList = new LinkedList<>();

            boolean atFront = false;
            for(char c : charArray) {
                if(c == ']') {
                    atFront = false;
                    for(int j = frontLinkedList.size(); j > 0; j--) {
                        char temp = frontLinkedList.get(j-1);
                        finalLinkedList.addFirst(temp);
                    }
                    frontLinkedList.clear();
                    continue;
                } else if(c == '[') {
                    atFront = true;
                    finalLinkedList.addAll(backLinkedList);
                    backLinkedList.clear();
                    continue;
                }

                if(atFront) {
                    if(c == '<') {
                        if(frontLinkedList.isEmpty()) continue;
                        frontLinkedList.removeLast();
                        continue;
                    }
                    frontLinkedList.addLast(c);
                } else {
                    if(c == '<') {
                        if(backLinkedList.isEmpty()) continue;
                        backLinkedList.removeLast();
                    } else {
                        backLinkedList.addLast(c);
                    }
                }
            }

            finalLinkedList.addAll(backLinkedList);
            String result = finalLinkedList.toString()
                            .substring(1, (finalLinkedList.size()*3)-1)
                            .replaceAll(", ", "").trim();

            System.out.println(result);
        }
        s.close();
    }
    
}
