import java.util.*;

public class Main {

    public static HashMap<String, Integer> hmap;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            hmap = new HashMap<>();
            StringBuilder initBoard = new StringBuilder(s.next());
            int score = play(initBoard);
            System.out.println(score);
        }
        
        s.close();
    }

    public static int play(StringBuilder board) {
        if(hmap.containsKey(board.toString())) return hmap.get(board.toString());

        int score = 0;

        for(var i = 0; i < board.length(); i++) {
            if(board.charAt(i) == 'o') score++;
        }

        for(int i = 0; i < board.length(); i++) {
            // do something
        }

        for(int i = board.length() - 1; i >= 2; i--) {
            // do something
        }

        hmap.put(board.toString(), score);
        return score;
    }
}