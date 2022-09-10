import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        double x1 = 100.0/a;
        double x2 = 100.0/(100-a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
