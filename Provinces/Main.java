import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int gold = s.nextInt();
        int silver = s.nextInt();
        int copper = s.nextInt();

        int handWorth = gold * 3 + silver * 2 + copper;

        String bestVictory = "";
        String bestTreasure = "";

        if(handWorth < 2){
            System.out.println("Copper");
        } else if(handWorth >= 8) {
            System.out.println("Province or Gold");
        } else if((handWorth >= 6)) {
            System.out.println("Duchy or Gold");
        } else if((handWorth == 5)) {
            System.out.println("Duchy or Silver");
        } else if((handWorth >= 3)) {
            System.out.println("Estate or Silver");
        } else if((handWorth >= 2)) {
            System.out.println("Estate or Copper");
        }
        
        s.close();
    }
}