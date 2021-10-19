import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for(int i = 0; i < cases; i++) {
            int n = s.nextInt();
            int days = s.nextInt();
            int sum = 0;

            for(int u = 0; u < days; u++) {
                sum += (u + 1);
            }
            int tot = sum + days;
        
            System.out.println(n + " " + tot);
        }
        
        s.close();
    }
}