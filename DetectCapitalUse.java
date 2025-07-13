public class DetectCapitalUse {

    // Solution class as per LeetCode format
    static class Solution {
        public boolean detectCapitalUse(String word) {
            return word.equals(word.toUpperCase()) ||
                   word.equals(word.toLowerCase()) ||
                   Character.isUpperCase(word.charAt(0)) && 
                   word.substring(1).equals(word.substring(1).toLowerCase());
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[] testWords = {"USA", "leetcode", "Google", "FlaG", "g", "G"};

        for (String word : testWords) {
            boolean result = solution.detectCapitalUse(word);
            System.out.println("Input: " + word + " → Output: " + result);
        }
    }
}
