import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = s.nextLine();
            String[] split = line.split(" ");
            String name = split[0] + " " + split[1];
            String course = split[2];

            List<String> courseList = map.get(course);
            if (courseList == null) {
                map.put(course, new ArrayList<>(Arrays.asList(name)));
            } else if (!courseList.contains(name)) {
                map.get(course).add(name);
            }
        }

        Map<String, List<String>> sortedMap = new TreeMap<>(map);

        for (Map.Entry<String, List<String>> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            List<String> val = entry.getValue();
            System.out.println(key + " " + val.size());
        }
    }
}
