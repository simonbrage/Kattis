import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        int d = s.nextInt();
        boolean found = false;

        for(int i = 0; i < d; i++){
            int a = s.nextInt();
            for(int j = 0; j < a; j++) {
                int b = s.nextInt();
                if(b == p){
                    found = true;
                }
            }

            if(found){
                System.out.println("KEEP");
            } else {
                System.out.println("REMOVE");
            }

            found = false;
        }

        s.close();
    }
}