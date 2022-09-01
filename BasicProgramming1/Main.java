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
            System.out.println("7");
            break;
            
            case 2:
            if(arr[0] > arr[1]) {
                System.out.println("Bigger");
                break;
            } else if(arr[0] == arr[1]) {
                System.out.println("Equal");
                break;
            } else {
                System.out.println("Smaller");
                break;
            }
            

            case 3:
            Arrays.sort(arr);
            System.out.print(arr[1]);
            break;

            case 4:
            int sum = Arrays.stream(arr).sum();
            System.out.println(sum);
            break;

            case 5:
            int evenSum = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 0) {
                    evenSum += arr[i];
                }
            }
            System.out.println(evenSum);
            break;

            case 6:
            String[] carr = new String[arr.length];
            for(int i = 0; i < arr.length; i++) {
                int x = arr[i] % 26;
                carr[i] = String.valueOf((char)(x + 'a'));
            }

            String joined = String.join("", carr);
            System.out.println(joined);
            break;

            case 7:
            int i = arr[0];
            List<Integer> temp = new ArrayList<Integer>();
            
            while(true) {
                if(i >= arr.length) {
                    System.out.println("Out");
                    break;
                } else if (i == arr.length - 1) {
                    System.out.println("Done");
                    break;
                } else if(temp.contains(i)) {
                    System.out.println("Cyclic");
                    break;
                }
                temp.add(i);
            }
            break;
            

        }
        s.close();
    }
}
