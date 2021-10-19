import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            String next = s.next();
            if(next.equals("P=NP")){
                System.out.println("skipped");
            } else {
                String[] nums = next.split("\\+");
                System.out.println(Integer.valueOf(nums[0]) + Integer.valueOf(nums[1]));
            }
        }
    }
}