import java.util.*;

public class Main {

    public static List<List<Integer>> graph = new ArrayList<>();
    public static Map<Integer, Integer> targets = new HashMap<>();
    public static int n;
    public static int m;
    
    public static void main(String[] args) {
        parse(); // Parse input and build graph
        compute(); // Compute result

        if(targets.size() != (n - 1)) {
            System.out.println("Impossible");
            return;
        }

        for(int i = 1; i < n; i++) {
            System.out.println(targets.get(i));
        }
    }

    public static void parse() {
        Scanner s = new Scanner(System.in);

        n = s.nextInt() + 1;
        m = s.nextInt();
        s.nextLine();

        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        while(m-- > 0) {
            String[] line = s.nextLine().split(" ");

            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        s.close();
    }

    public static void compute() {
        for(int i = 1; i < n; i++) {
            boolean[] hits = new boolean[n];
            for(int t : graph.get(i)) {
                if(hit(hits, t)) {
                    targets.put(t, i);
                    break;
                }
            }
        }
    }

    public static boolean hit(boolean[] hits, int target) {
        Integer player = targets.get(target);
        
        if(player == null) return true;

        hits[target] = true;
        for(int t : graph.get(player)) {
            if(!hits[t] && hit(hits, t)) {
                targets.put(t, player);
                return true;
            }
        }

        return false;
    }
}