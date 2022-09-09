import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for(int i = 0; i < t; i++) {
            Long scalar = 0L;

            int n = s.nextInt();
            s.nextLine();
            String line1 = s.nextLine().trim();
            String line2 = s.nextLine().trim();

            long[] v1 = Arrays.stream(line1.split(" ")).mapToLong(Long::parseLong).toArray();
            long[] v2 = Arrays.stream(line2.split(" ")).mapToLong(Long::parseLong).toArray();
            Long[] r1 = Arrays.stream(v1).boxed().toArray(Long[]::new);
            Long[] r2 = Arrays.stream(v2).boxed().toArray(Long[]::new);

            Arrays.sort(r1);
            Arrays.sort(r2, Collections.reverseOrder());

            for(int j = 0; j < n; j++) {
                scalar += r1[j]*r2[j];
            }

            System.out.println(String.format("Case #%s: %d", i+1, scalar));
        }

        s.close();
    }
}