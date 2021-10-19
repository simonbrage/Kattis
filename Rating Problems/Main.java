import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt(), rated = s.nextInt();
        int diff = total - rated;
        int sum = 0;
        
        for(int i = 0; i < rated; i++){
            sum += s.nextInt();
        }

        Double lowestScore = (sum + (diff*(-3.0)))/total;
        Double highestScore = (sum + (diff*(3.0)))/total;

        System.out.println(lowestScore + " " + highestScore);

        s.close();
    }
}