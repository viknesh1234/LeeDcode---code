public class LongestUncommonSubsequence {

    // LeetCode-style solution class
    static class Solution {
        public int findLUSlength(String a, String b) {
            if (a.equals(b)) return -1;
            return Math.max(a.length(), b.length());
        }
    }

    // Main method to test different inputs
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[][] testCases = {
            {"aba", "cdc"},
            {"aaa", "aaa"},
            {"abc", "def"},
            {"a", "ab"},
            {"hello", "world"}
        };

        for (String[] pair : testCases) {
            String a = pair[0];
            String b = pair[1];
            int result = solution.findLUSlength(a, b);
            System.out.println("Input: a = \"" + a + "\", b = \"" + b + "\" → Output: " + result);
        }
    }
}
