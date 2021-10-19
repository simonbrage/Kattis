import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String binary = Integer.toBinaryString(num);

        StringBuilder input = new StringBuilder();
        input.append(binary);
        String revBinary = input.reverse().toString();

        int rev = Integer.parseInt(revBinary, 2);

        System.out.println(rev);

        
        s.close();
    }
}