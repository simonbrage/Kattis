import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        Long[] prices = new Long[n];

        for(int i = 0; i < n; i++) {
            prices[i] = s.nextLong();
        }

        Arrays.sort(prices, new Comparator<Long>() {
            public int compare(Long a, Long b) {
                return a < b ? 1 : a > b ? -1 : 0;
            }
        });

        long sum = 0;
        for(int i = 2; i < n; i=i+3) {
            sum += prices[i];
        }

        System.out.println(sum);

        s.close();
    }
}
