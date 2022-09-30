import java.util.*;

public class Main {

    public static HashMap<String, Integer> memo;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            memo = new HashMap<>();
            StringBuilder initBoard = new StringBuilder(s.next());
            int score = play(initBoard);
            System.out.println(score);
        }
        
        s.close();
    }

    public static int play(StringBuilder board) {
        if(memo.containsKey(board.toString())) return memo.get(board.toString());

        int score = 0;

        for(var i = 0; i < board.length(); i++) {
            if(board.charAt(i) == 'o') score++;
        }

        // Find moves to the right from bottom-up 
        for(int i = 0; i < board.length() - 2; i++) {
            if(board.charAt(i) == 'o' 
                && board.charAt(i+1) == 'o' 
                && board.charAt(i+2) == '-') {
                    board.setCharAt(i, '-');
                    board.setCharAt(i+1, '-');
                    board.setCharAt(i+2, 'o');

                    int newScore = play(board);
                    if(newScore < score) {
                        score = newScore;
                    }

                    // Reset
                    board.setCharAt(i, 'o');
                    board.setCharAt(i+1, 'o');
                    board.setCharAt(i+2, '-');
            }
        }

        // Find moves to the left from top-down 
        for(int i = board.length() - 1; i >= 2; i--) {
            if(board.charAt(i) == 'o' 
            && board.charAt(i-1) == 'o' 
            && board.charAt(i-2) == '-') {
                board.setCharAt(i, '-');
                board.setCharAt(i-1, '-');
                board.setCharAt(i-2, 'o');
                
                int newScore = play(board);
                if(newScore < score) {
                    score = newScore;
                }

                // Reset
                board.setCharAt(i, 'o');
                board.setCharAt(i-1, 'o');
                board.setCharAt(i-2, '-');
        }
        }

        // Save board state (memoization)
        memo.put(board.toString(), score);
        return score;
    }
}