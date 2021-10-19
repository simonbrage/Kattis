import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double cost = s.nextDouble();
        double lawns = s.nextDouble();

        double width = 0.0, length = 0.0, area = 0.0;

        for(int i = 0; i < lawns; i++) {
            width = s.nextDouble();
            length = s.nextDouble();
            area += width*length;
        }

        System.out.println(cost*area);

        s.close();
    }
}