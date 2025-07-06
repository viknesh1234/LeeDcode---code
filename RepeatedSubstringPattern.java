public class RepeatedSubstringPattern {

    // LeetCode solution method
    public static boolean repeatedSubstringPattern(String s) {
        // Concatenate the string with itself
        String doubled = s + s;

        // Remove the first and last characters
        String trimmed = doubled.substring(1, doubled.length() - 1);

        // Check if the original string exists in the trimmed version
        return trimmed.contains(s);
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Test cases
        String[] testInputs = { "abab", "aba", "abcabcabc", "a", "aaaa" };

        for (String input : testInputs) {
            boolean result = repeatedSubstringPattern(input);
            System.out.println("Input: \"" + input + "\" ➤ Output: " + result);
        }
    }
}
