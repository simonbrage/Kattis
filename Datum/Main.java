import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int day = s.nextInt();
        int month = s.nextInt();
        int year = 2009;

        // Based on Gauss' algorithm for Gregorian calendars (Sunday = 0, ..., Saturday = 6)
        int[] monthOffsets = new int[] {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int c =  year / 100;
        int y = year % 100;
        int d = (day + monthOffsets[month - 1] + 5*((year - 1) % 4) + 4*((year - 1) % 100) + 6*((year - 1) % 400)) % 7;
        
        switch(d) {
            case 0:
            System.out.println("Sunday");
            break;

            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;
        }

        s.close();
    }
}