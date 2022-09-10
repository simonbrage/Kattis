import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int v = s.nextInt();

        int result = (int) Math.ceil(h/Math.sin(Math.toRadians(v)));

        System.out.println(result);
    }
}