import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while(n-- > 0){
            char[] first = s.next().toCharArray();
            char[] second = s.next().toCharArray();

            System.out.println(first);
            System.out.println(second);

            for(int i = 0; i < first.length; i++)
                if(first[i] == second[i]){
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            
            System.out.println("");
            System.out.println("");

        }
        

        s.close();
    }
}