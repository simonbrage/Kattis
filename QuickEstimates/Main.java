import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a = 0, count = 0;

        for(int i = 0; i < num; i++){
            a = s.nextInt();
            if(a == 0){
                System.out.println("1");
                continue;
            }
            while(a != 0){
                a = a / 10;
                count++;
            }
            System.out.println(count);
            count = 0; 
        }
        
        s.close();
    }
}