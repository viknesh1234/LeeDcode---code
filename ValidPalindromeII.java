public class ValidPalindromeII {

    public static void main(String[] args) {
        String input = "abca"; // ✅ You can change this input to test other cases
        Solution solution = new Solution();
        boolean result = solution.validPalindrome(input);
        System.out.println("Is Valid Palindrome (with at most one deletion): " + result);
    }
}

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping either left or right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
}
