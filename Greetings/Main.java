import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int count = 0;
        String letter = "e";

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'e'){
                count++;
            }
        }

        String result = letter.repeat(count*2);

        System.out.println("h" + result + "y");

        s.close();
    }
}