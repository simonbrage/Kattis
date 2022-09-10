import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int g = s.nextInt();
        int t = s.nextInt();
        int n = s.nextInt();

        double max = (g - t) * 0.9;

        int itemWeight = 0;
        for(int i = 0; i < n; i++) {
            itemWeight += s.nextInt();
        }

        int trailerWeight = (int) max - itemWeight;

        System.out.println(trailerWeight);
    }
}
