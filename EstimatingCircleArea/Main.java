import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        boolean zero = false;

        while(!zero) {
            double r = s.nextDouble();
            int m = s.nextInt();
            int c = s.nextInt();
            if(r == 0.0 && m == 0 && c == 0) {
                zero = true;
                continue;
            }

            double realArea = Math.PI * r * r;
            double squareArea = (r * 2) * (r * 2);
            double ratio = (c*1.0) / (m*1.0);
            double estArea = squareArea * ratio;
            System.out.println(realArea + " " + estArea);
        }

        s.close();
    }
}