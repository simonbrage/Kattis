import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int d1 = s.nextInt();
        int d2 = s.nextInt();

        Map<Integer, Integer> prob = new HashMap<>();

        int sum = 0, count = 0;
        for(int i = 1; i <= d1; i++) {
            for(int j = 1; j <= d2; j++) {
                sum = i+j;

                if(prob.get(sum) == null) {
                    prob.put(sum, 1);
                } else {
                    count = prob.get(sum) + 1;
                    prob.replace(sum, count);
                }
            }
        }
        int max = Collections.max(prob.values());

        for(Map.Entry<Integer, Integer> p : prob.entrySet()) {
            if(p.getValue() == max) {
                System.out.println(p.getKey());
            }
        } 

    }
}
