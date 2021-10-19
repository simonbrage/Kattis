import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String number = String.valueOf(n);

        if(number.startsWith("555")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        s.close();
    }
}