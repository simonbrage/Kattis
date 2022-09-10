import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String string = s.nextLine();

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a') {
                System.out.println(string.substring(i));
                break;
            }
        }
    }
}
