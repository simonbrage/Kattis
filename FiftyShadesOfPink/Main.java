import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(), count = 0;
        
        for(int i = 0; i < n; i++) {
            String w = s.next().toLowerCase();
            if(w.contains("rose") || w.contains("pink")) count++;
        }

        if(count == 0) {
            System.out.println("I must watch Star Wars with my daughter");
        } else {
            System.out.println(count);
        }

        s.close();
    }
}