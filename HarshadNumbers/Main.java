import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean found = false;

        while(!found){
            int sum = String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum();
            int result = n % sum;
            if(result == 0){
                System.out.println(n);
                found = true;
            } else {
                n++;
            }
        }

        s.close();
    }
}