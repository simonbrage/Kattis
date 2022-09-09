// ------------------------------------------------------
// NOTE! This solution doesn't work in it's current state
// ------------------------------------------------------

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

    public static void t1(long[] arr) {
        System.out.println("7");
    }

    public static void t2(long[] arr) {
        if(arr[0] > arr[1]) {
            System.out.println("Bigger");
        } else if(arr[0] == arr[1]) {
            System.out.println("Equal");
        } else {
            System.out.println("Smaller");
        }
    }

    public static void t3(long[] arr) {
        long[] subArr = Arrays.copyOfRange(arr, 0, 3);
        Arrays.sort(subArr);
        System.out.println(subArr[1]);
    }

    public static void t4(long[] arr) {
        long sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }

    public static void t5(long[] arr, int n) {
        long evenSum = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
        }
        System.out.println(evenSum);
    }

    public static void t6(long[] arr, int n) {
        String[] carr = new String[n];
        for(int i = 0; i < n; i++) {
            long x = arr[i] % 26;
            carr[i] = String.valueOf((char)(x + 'a'));
        }

        String joined = String.join("", carr);
        System.out.println(joined);
    }

    public static void t7(long[] arr, int n) {
        long i = arr[0];
        HashSet<Long> temp = new HashSet<Long>();
        
        temp.add(i);

        while(i < arr.length) {
            if (i == n - 1) {
                System.out.println("Done");
                return;
            } 
            
            i = arr[(int) i];

            if(!temp.add(i)) {
                System.out.println("Cyclic");
                return;
            }
        }
        System.out.println("Out");
    }
}
