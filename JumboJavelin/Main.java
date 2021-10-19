import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int loss = num-1;
        int length = 0;

        for(int i = 0; i < num; i++)
        {
            length += s.nextInt();
        }
        System.out.println(length-loss);
        s.close();
    }
}