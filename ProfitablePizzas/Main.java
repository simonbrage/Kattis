import java.util.*;

class Delivery {
    int deadline;
    int profit;

    public Delivery(int deadline, int profit) {
        this.deadline = deadline;
        this.profit = profit;
    }

    public int getDeadline() {
        return deadline;
    }

    public int getProfit() {
        return profit;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        List<Delivery> list = new LinkedList<Delivery>();

        int max = 0;
        for(int i = 0; i < n; i++) {
            int deadline = s.nextInt();
            int profit = s.nextInt();

            Delivery d = new Delivery(deadline, profit);
            list.add(d);
            
            if(deadline > max) {
                max = deadline;
            }
        }

        Collections.sort(list, (x, y) -> y.getProfit() - x.getProfit());

        int result = deliverySequencer(list, max, n);

        System.out.println(result);
    }

    public static int deliverySequencer(List<Delivery> list, int max, int n) {
        Delivery[] chosen = new Delivery[max];

        int profit = 0;

        for(int i = 0; i < n; i++) {
            for(int j = list.get(i).getDeadline()-1; j >= 0; j--) {
                if(chosen[j] == null) {
                    Delivery res = list.get(i);
                    chosen[j] = res;
                    profit += res.getProfit();
                    break;
                }
            }
        }

        return profit;
    }
}
