import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        if(x > y) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}