import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String passOne = s.nextLine();
        String passTwo = s.nextLine();

        int count = 0;

        for(int i = 0; i < 4; i++) {
            if(passOne.charAt(i) != passTwo.charAt(i)) {
                count++;
            }
        }

        System.out.println((int) Math.pow(2, count));

        s.close();
    }
}