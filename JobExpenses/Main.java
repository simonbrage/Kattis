import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int x = s.nextInt();
            if(x < 0) {
                sum += x;
            }
        }

        System.out.println(Math.abs(sum));

        s.close();
    }
}