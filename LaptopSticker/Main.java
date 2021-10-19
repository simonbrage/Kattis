import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int wC = s.nextInt();
        int hC = s.nextInt();
        int wS = s.nextInt();
        int hS = s.nextInt();

        System.out.println(space(wC, hC, wS, hS));

        s.close();
    }

    public static int space(int wC, int hC, int wS, int hS) {
        int wDiff = wC - wS;
        int hDiff = hC - hS;
        
        if(wDiff > 1 && hDiff > 1){
            return 1;
        } else {
            return 0;
        }
    }
}