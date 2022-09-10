import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            int imports = 0;
            int prev = s.nextInt();
            while(true) {
                int curr = s.nextInt();
                if(curr == 0) break;
                if(curr > prev*2) {
                    imports += curr - prev*2;
                }
                prev = curr;
            }
            System.out.println(imports);
        }
    }
}