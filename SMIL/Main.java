import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] cases = {"-)", ")"};

        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split("");
        
        for (int i = 0; i < in.length; i++) {
            if(in[i].equals(":") || in[i].equals(";")) {
                if(i <= in.length - 2 && in[i+1].equals(")")) {
                    System.out.println(i);
                } else if(i <= in.length - 3 && in[i+1].equals("-") && in[i+2].equals(")")) {
                    System.out.println(i);
                }
            }
        }

        s.close();
    }
}