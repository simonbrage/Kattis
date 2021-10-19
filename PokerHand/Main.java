import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String hand = s.next();

        String[] handArray = hand.split(" ");
        int count = 0, currCount = 0;

        for(int i = 0; i < handArray.length; i++){
            char rank = handArray[i].charAt(0);
            for(int n = 0; n < handArray.length; i++) {
                if(n == i) {continue;}

                char currRank = handArray[n].charAt(0);
                if(rank == currRank) {
                    currCount++;
                }

            }

            if(currCount > count){
                count = currCount;
            }
        }

        s.close();
    }
}