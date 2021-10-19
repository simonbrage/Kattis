import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();

        for(int i = 0; i < cases; i++){
            int outlets = s.nextInt();
            int sum = 0;

            for(int n = 0; n < outlets; n++) {
                sum += s.nextInt();
            }
            System.out.println(sum - (outlets - 1));
        }

        s.close();
    }
}