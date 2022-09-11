import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pass = s.nextLine();

        System.out.println("" + pass.charAt(1) + pass.charAt(0));

        s.close();
    }
}