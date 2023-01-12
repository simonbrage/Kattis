import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        
        if(word.endsWith("eh?"))
            System.out.println("Canadian!");
        else
            System.out.println("Imposter!");
        
            s.close();
    }
}