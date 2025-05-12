 import java.util.Scanner;
 public class validPlaindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Prompt user
        System.out.print("Enter a string to check for palindrome: ");
        String s = scanner.nextLine();  // Read full line of input

        // Check and display result
        if (isPalindrome(s)) {
            System.out.println("✅ \"" + s + "\" is a valid palindrome.");
        } else {
            System.out.println("❌ \"" + s + "\" is NOT a valid palindrome.");
        }

        scanner.close();  // Close scanner
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");  // Clean input

        int left = 0;
        int right = s.length() - 1;

        // Two-pointer check
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


