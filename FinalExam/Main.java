import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String oldAns = s.next();
        String newAns = "";
        int count = 0;

        for(int i = 0; i < n-1; i++) {
            newAns = s.next();
            if(newAns.equals(oldAns)){
                count++;
            }
            oldAns = newAns;
        }

        System.out.print(count);

        s.close();
    }
}