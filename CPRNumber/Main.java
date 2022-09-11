import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] m = new int[] {4, 3, 2, 7, 6, 5, 4, 3, 2, 1};

        String line = s.nextLine();
        String nums = line.substring(0, 6) + line.substring(7);

        int res = 0;
        for(int i = 0; i < nums.length(); i++) {
            res += (nums.charAt(i) - '0') * m[i];
        }
        
        if(res % 11 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        s.close();
    }
}