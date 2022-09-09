import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        int[][] intervals = new int[n][];

        for(int i = 0; i < n; i++){
            String line = s.nextLine().trim();
            int[] ints = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            intervals[i] = ints;
        }

        Arrays.sort(intervals, (x, y) -> Integer.compare(x[1], y[1]));
        
        int currentFinish = 0;
        int count = 0;
        for(int[] interval : intervals) {
            if(interval[0] >= currentFinish) {
                currentFinish = interval[1];
                count++;
            }
        }

        System.out.println(count);

        s.close();

    }
}
