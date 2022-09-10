import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(java.util.Locale.US);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            int b = s.nextInt();
            double p = s.nextDouble();
            double diff = 60/p;

            System.out.println(diff*b-diff + " " + diff*b + " " + (diff*b+diff));
        }
    }
}