import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double mile = s.nextDouble();
        double var = 5280/4854 * 1000.0;

        System.out.println(var);

        
        s.close();
    }
}