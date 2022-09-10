import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();

        int[] socks = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(socks);

        int machines = 1, sockCount = 0, lowSock = socks[0], currentSock = 0;


        for(int i = 0; i < s; i++) {
            currentSock = socks[i];
            
            if(sockCount == c) {
                machines++;
                sockCount = 0;
                lowSock = currentSock;
            }
            
            if(Math.abs(currentSock - lowSock) <= k) {
                sockCount++;
            } else {
                machines++;
                sockCount = 1;
                lowSock = currentSock;
            }
        }
        System.out.println(machines);

    }
}
