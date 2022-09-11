import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        String line = s.nextLine();

        for(int i = 0; i < cases; i++) {
            line = s.nextLine();
            if(line.startsWith("simon says ")) {
                System.out.println(line.substring(11));
            } else {
                System.out.println("");
            }
        }
        
        s.close();
    }
}