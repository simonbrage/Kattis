import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();

        String[] vowels = {"a", "e", "i", "o", "u"};

        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Arrays.asList(vowels).contains(line.substring(i, i + 1).toLowerCase())) {
                count++;
            }
        }

        System.out.println(count);
        
    }
}
