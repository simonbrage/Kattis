import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String played = s.next();

        int countT = 0, countC = 0, countG = 0;
        int tScore = 0, cScore = 0, gScore = 0;

        for(int i = 0; i < played.length(); i++) {
            if(played.charAt(i) == 'T'){
                countT++;
            } else if(played.charAt(i) == 'C') {
                countC++;
            } else {
                countG++;
            }
        }

        if(countT != 0) {tScore = countT*countT;}
        if(countC != 0) {cScore = countC*countC;}
        if(countG != 0) {gScore = countG*countG;}

        if(countT != 0 && countC != 0 && countG != 0){
            int lowest = Math.min(Math.min(countT, countC), countG);
            System.out.println(tScore+cScore+gScore+(7*lowest));
        } else {
            System.out.println(tScore+cScore+gScore);
        }
        
        s.close();
    }
}