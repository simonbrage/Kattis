import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt() - 0;

        int curr = 0;
        int layers = 0;

        while(n > 0) {
            if(layers == 0) {
                layers++;
                curr++;
                n--;
                continue;
            } else {
                curr = curr + 2;
                int blocks = curr * curr;
                if(n - blocks >= 0) {
                    layers++;
                    n = n - blocks;
                    continue;
                } else {
                    break;
                }
            }

        }

        System.out.println(layers);
        
    }
}