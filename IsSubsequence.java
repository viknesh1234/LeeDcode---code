// File: IsSubsequence.java

public class IsSubsequence {

    // Method to check if s is a subsequence of t
    public static boolean isSubsequence(String s, String t) {
        // Initialize two pointers
        int i = 0;
        int j = 0;

        // Loop through t
        while (i < s.length() && j < t.length()) {
            // If characters match, move i
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move j
            j++;
        }

        // If i reached the end of s, return true
        return i == s.length();
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test cases
        String s1 = "abc";
        String t1 = "ahbgdc";

        String s2 = "axc";
        String t2 = "ahbgdc";

        // Run the function and print the results
        System.out.println("Is 'abc' a subsequence of 'ahbgdc'? " + isSubsequence(s1, t1)); // true
        System.out.println("Is 'axc' a subsequence of 'ahbgdc'? " + isSubsequence(s2, t2)); // false
    }
}
