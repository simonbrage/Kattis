import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<String> winners = new ArrayList<>();
        ArrayList<String> uni = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String x = s.nextLine();
            String[] split = x.split(" ");
            for(int j = 0; j < uni.size(); j++) {
                if(split[0] != uni.get(j)){
                    uni.add(split[0]);
                    winners.add(x);
                } else {
                    continue;
                }
            }
        }

        for(int h = 0; h < winners.size(); h++) {
            System.out.println(winners.get(h));
        }
    }
}