import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int revA = 0, revB = 0;

        while(a != 0 && b != 0) {
            int digitA = a % 10;
            int digitB = b % 10;

            revA = revA * 10 + digitA;
            revB = revB * 10 + digitB;
            
            a /= 10;
            b /= 10;
        }

        if(revA > revB) {
            System.out.println(revA);
        } else {
            System.out.println(revB);
        }
        
        s.close();
    }
}