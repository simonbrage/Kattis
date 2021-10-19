import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        while(n-- > 0){
            char[] encoded = s.nextLine().toCharArray();
            int side = (int) Math.sqrt(encoded.length);
            char[][] message = new char[side][side];
            int i = 0;

            for(int row = 0; row < side; row++) 
                for(int col = 0; col < side; col++)
                    message[row][col] = encoded[i++];

            for(int col = side-1; col >= 0; col--)
                for(int row = 0; row < side; row++)
                    System.out.print(message[row][col]);
            System.out.println();
        }
        

        s.close();
    }
}