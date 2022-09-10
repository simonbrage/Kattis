import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            Set<String> set = new HashSet<String>();
            int m = s.nextInt();
            for(int j = 0; j < m; j++) {
                set.add(s.next());
            }
            System.out.println(set.size());
        }
    }
}