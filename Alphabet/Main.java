import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int length = word.length();

        double whiteCount = 0.0, upperCount = 0.0, lowerCount = 0.0, symbolCount = 0.0;

        for(int i = 0; i < length; i++){
            char c = word.charAt(i);
            if(c == '_'){
                whiteCount++;
            } else if(Character.isLowerCase(c)){
                lowerCount++;
            } else if(Character.isUpperCase(c)){
                upperCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println(whiteCount/length);
        System.out.println(lowerCount/length);
        System.out.println(upperCount/length);
        System.out.println(symbolCount/length);

        /* Round to 15 significant digits NOT NECESSARY
        
        BigDecimal bdWhite = new BigDecimal(whiteCount/length);
        BigDecimal bdUpper = new BigDecimal(upperCount/length);
        BigDecimal bdLower = new BigDecimal(lowerCount/length);
        BigDecimal bdSymbol = new BigDecimal(symbolCount/length);

        bdWhite = bdWhite.round(new MathContext(15));
        bdUpper = bdUpper.round(new MathContext(15));
        bdLower = bdLower.round(new MathContext(15));
        bdSymbol = bdSymbol.round(new MathContext(15));

        System.out.println(bdWhite.doubleValue());
        System.out.println(bdLower.doubleValue());
        System.out.println(bdUpper.doubleValue());
        System.out.println(bdSymbol.doubleValue());*/
        
        s.close();
    }
}