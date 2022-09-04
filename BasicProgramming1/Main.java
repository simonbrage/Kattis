import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int t = s.nextInt();

        s.nextLine();
        String line = s.nextLine();
        int[] arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        switch(t) {
            case 1:
            t1(arr);
            break;
            
            case 2:
            t2(arr);
            break;

            case 3:
            t3(arr);
            break;

            case 4:
            t4(arr);
            break;

            case 5:
            t5(arr, n);
            break;

            case 6:
            t6(arr, n);
            break;

            case 7:
            t7(arr, n);
            break;
        }
        s.close();
    }

    public static void t1(int[] arr) {
        System.out.println("7");
    }

    public static void t2(int[] arr) {
        if(arr[0] > arr[1]) {
            System.out.println("Bigger");
        } else if(arr[0] == arr[1]) {
            System.out.println("Equal");
        } else {
            System.out.println("Smaller");
        }
    }

    public static void t3(int[] arr) {
        Arrays.sort(arr);
        System.out.print(arr[1]);
    }

    public static void t4(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }

    public static void t5(int[] arr, int n) {
        int evenSum = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }
        System.out.println(evenSum);
    }

    public static void t6(int[] arr, int n) {
        String[] carr = new String[n];
        for(int i = 0; i < arr.length; i++) {
            int x = arr[i] % 26;
            carr[i] = String.valueOf((char)(x + 'a'));
        }

        String joined = String.join("", carr);
        System.out.println(joined);
    }

    public static void t7(int[] arr, int n) {
        int i = arr[0];
        List<Integer> temp = new ArrayList<Integer>();
        
        while(true) {
            if(i >= n) {
                System.out.println("Out");
                return;
            } else if (i == n - 1) {
                System.out.println("Done");
                return;
            } else if(temp.contains(i)) {
                System.out.println("Cyclic");
                return;
            }
            temp.add(i);
        }
    }
}
