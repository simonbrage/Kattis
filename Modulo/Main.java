import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        Set<Integer> numbers = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            int n = s.nextInt();
            int m = n % 42;
            numbers.add(m);
        }

        System.out.println(numbers.size());

        s.close();
    }
}