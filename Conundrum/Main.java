import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String string = s.next();
        int count = 0;
        int p = 0, e = 1, r = 2;
        char[] message = string.toCharArray();

        while(p < message.length){
            if(message[p] != 'P'){
                count++;
            }
            p = p + 3;
        }

        while(e < message.length){
            if(message[e] != 'E'){
                count++;
            }
            e = e + 3;
        }

        while(r < message.length){
            if(message[r] != 'R'){
                count++;
            }
            r = r + 3;
        }

        System.out.println(count);

        s.close();
    }
}