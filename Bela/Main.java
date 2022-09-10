import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String b = s.next();

        int points = 0;

        for(int i = 0; i < 4*n; i++) {
            String card = s.next();

            switch(card.charAt(0)) {
                case 'A':
                points += 11; 
                break;

                case 'K':
                points += 4;
                break;

                case 'Q':
                points += 3;
                break;

                case 'J':
                if(card.charAt(1) == b.charAt(0)) {
                    points += 20;
                } else {
                    points += 2;
                }
                break;

                case 'T':
                points += 10;
                break;

                case '9':
                if(card.charAt(1) == b.charAt(0)) {
                    points += 14;
                } else {
                    points += 0;
                }
                break;

                default:
                break;
            }
        }
        
        System.out.println(points);
    }
}
