import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String w = s.next();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < w.length(); i++) {
            char curr = w.charAt(i);
            if(map.put(curr, 1) == null) {
                map.put(curr, 1);
            } else {
                System.out.println(0);
                break;
            }

            if(i == w.length()-1) System.out.println(1);
        }
    }
}