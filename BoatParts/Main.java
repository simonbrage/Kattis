import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int parts = s.nextInt();
        int days = s.nextInt();
        Set<String> set = new HashSet<String>();
        int i;

        for(i = 0; i < days; i++){
            String part = s.next();
            if(set.size() == parts) break;
            set.add(part);
        }

        if(set.size() == parts){
            System.out.println(i);
        } else { 
            System.out.println("paradox avoided");
        }

        s.close();
    }
}