import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        double bases = 0.0;
        int bats = n;
        for(int i = 0; i < n; i++) {
            int score = s.nextInt();

            if(score >= 0) {
                bases += score;
            } else {
                bats = bats - 1;
            }
        }
        System.out.println(bases/bats);
    }
}
