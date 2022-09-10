import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            int m = s.nextInt();
            int[] arr = new int[m];
            for(int j = 0; j < m; j++) {
                arr[j] = s.nextInt();
            }
            Arrays.sort(arr);

            int res = (arr[m-1] - arr[0])*2;
            System.out.println(res);
        }
    }
}