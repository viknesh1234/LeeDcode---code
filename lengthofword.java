import java.util.Scanner;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            } else if (s.charAt(i) == ' ' && count > 0) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}

public class lengthofword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Solution solution = new Solution();
        int result = solution.lengthOfLastWord(input);
        
        System.out.println("Length of last word: " + result);
        scanner.close();
    }
}

