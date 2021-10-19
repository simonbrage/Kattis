import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Boolean isRunning = false;
        int accumulatedTime = 0;
        int previousTime = 0;

        for(int i = 0; i < num; i++){
            int currentTime = s.nextInt();
            if(isRunning){
                accumulatedTime += currentTime - previousTime;
            }

            previousTime = currentTime;
            isRunning = !isRunning;
        }

        if(isRunning){
            System.out.println("still running");
        } else {
            System.out.println(accumulatedTime);
        }

        s.close();
    }
}