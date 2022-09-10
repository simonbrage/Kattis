import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] mustLearn = new int[n];
        int[] learned = new int[n-1];

        for(int i = 0; i < n; i++) {
            mustLearn[i] = s.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            learned[i] = s.nextInt();
        }

        s.close();

        boolean found = false;
        for(int i = 0; i < n; i++) {
            found = false;
            for(int j = 0; j < n-1; j++) {
                if(mustLearn[i] == learned[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println(mustLearn[i]);
                break;
            }
        }
    }
}