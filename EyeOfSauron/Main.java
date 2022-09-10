import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();
        String[] arr = line.split("\\(\\)", 2);

        if(arr[0].length() != arr[1].length()) {
            System.out.println("fix");
        } else {
            System.out.println("correct");
        }

        s.close();
    }
}