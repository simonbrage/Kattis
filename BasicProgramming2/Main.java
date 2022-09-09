import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int t = s.nextInt();

        s.nextLine();
        String line = s.nextLine();
        long[] arr = Arrays.stream(line.split(" ")).mapToLong(Long::parseLong).toArray();

        switch(t) {
            case 1:
            t1(arr, n);
            break;

            case 2:
            t2(arr, n);
            break;

            case 3:
            t3(arr, n);
            break;

            case 4:
            t4(arr, n);
            break;

            case 5:
            t5(arr, n);
            break;
        }
        s.close();
    }

    public static void t1(long[] arr, int n) {
        long target = 7777;
        Map<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            long complement = target - arr[i];
            if(map.containsKey(complement) && complement != arr[i]) {
                System.out.println("Yes");
                return;
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("No");
    }

    public static void t2(long[] arr, int n) {
        Set<Long> set = new HashSet<>();
        for(long num : arr) {
            if(set.contains(num)) {
                System.out.println("Contains duplicate");
                return;
            } else {
                set.add(num);
            }
        }
        System.out.println("Unique");
    }

    public static void t3(long[] arr, int n) {
        Map<Long, Integer> map = new HashMap<>();
        for(long i : arr) {
            if(map.containsKey(i)) {
                int count = map.get(i) + 1;
                if(count > (n/2)) {
                    System.out.println(i);
                    return;
                } else {
                    map.put(i, count);
                }
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(-1);
    }

    public static void t4(long[] arr, int n) {
        Arrays.sort(arr);
        if(n % 2 != 0) {
            System.out.println(arr[(n/2)]);
        } else {
            System.out.println(arr[(n/2)-1] + " " + arr[(n/2)]);
        }
    }

    public static void t5(long[] arr, int n) {
        int min = 100;
        int max = 999;

        Arrays.sort(arr);

        for(long i : arr) {
            if(i >= min && i <= max) {
                System.out.print(i + " ");
            }
        }
    }
}

