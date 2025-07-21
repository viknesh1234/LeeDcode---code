import java.util.Scanner;

public class RobotReturn {

    
    static class Solution {
        public boolean judgeCircle(String moves) {
            int x = 0, y = 0;

            for (char move : moves.toCharArray()) {
                if (move == 'U') y++;
                else if (move == 'D') y--;
                else if (move == 'L') x--;
                else if (move == 'R') x++;
            }

            return x == 0 && y == 0;
        }
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter robot moves (e.g., UDLR): ");
        String moves = scanner.nextLine();

        Solution sol = new Solution();
        boolean result = sol.judgeCircle(moves);

        System.out.println("Returns to Origin? " + result);
    }
}
