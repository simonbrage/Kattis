import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int q = s.nextInt();

        int[] pos = new int[n];

        for(int i = 0; i < n; i++) {
            pos[i] = s.nextInt();
        }

        for(int i = 0; i < q; i++) {
            int query = s.nextInt();
            if(query == 1) {
                int c = s.nextInt();
                int x = s.nextInt();

                pos[c-1] = x;
            } else {
                int a = s.nextInt();
                int b = s.nextInt();

                System.out.println(Math.abs(pos[a-1]-pos[b-1]));
            }
        }



    }
}