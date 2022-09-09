import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();

        int[] arr = new int[n];

        int i = 0;
        while(s.hasNext()) {
            arr[i] = s.nextInt();
            i++;
        }

        if(l < 13) {
            System.out.println(0);
        } else if(n == 0) {
            System.out.println(((l-12)/d)+1);
        } else {
            Arrays.sort(arr);

            int total = 0;
            
            int leftSpace = arr[0] - 6;
            int rightSpace = (l - 6) - arr[n-1];

            total = (leftSpace/d) + (rightSpace/d);
            
            for(int j = 0; j < n-1; j++) {
                int space = arr[j+1] - arr[j];
                int fits = space/d - 1;
                total += fits;
                
            }
            
            System.out.println(total);
        }

        s.close();
    }
}
