import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();
        s.close();

        double semiPerimeter = (a+b+c+d)/2.0;

        double max = Math.sqrt((semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c)*(semiPerimeter-d));

        System.out.println(max);
    }
}