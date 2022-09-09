import java.util.*;

public class Main {  
    public static void main(String args[]) { 
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            long a = s.nextLong();
            long b = s.nextLong();
        
            long result = Math.abs(a - b);
            System.out.println(result);
        }
        
        s.close();
        
    }
}  