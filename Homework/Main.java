import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        String[] splitString = word.split(";");
        int count = 0;

        for(int i = 0; i < splitString.length; i++){
            String task = splitString[i];
            if(task.contains("-")){
                String[] newSplit = task.split("-");
                if(newSplit.length != 0) {
                    int first = Integer.parseInt(newSplit[0]);
                    int sec = Integer.parseInt(newSplit[1]);

                    count += (sec - first) + 1;
                }
            } else {
               count++;
            }
        }

        System.out.println(count);

        s.close();
    }
}