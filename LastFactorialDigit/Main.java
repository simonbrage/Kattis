import java.util.*;

// Solution explained: Any number multiplied by a factor of 10 will trail with 0. 
// So any actorial *after* 4! (that is: 5!, 6! ... n!, (n+1)!) will have trailing zeroes.
// 5*2 is a factor of 10 - in fact any product between an even number 
// and a number of factor 5 will be a multiple of 10.

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            int x = s.nextInt();

            switch(x) {
                case 1:
                System.out.println(1);
                break;

                case 2:
                System.out.println(2);
                break;

                case 3:
                System.out.println(6);
                break;

                case 4:
                System.out.println(4);
                break;

                default:
                System.out.println(0);
                break;
            }

        }
    }
}