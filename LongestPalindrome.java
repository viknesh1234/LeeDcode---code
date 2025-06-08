// File: LongestPalindrome.java

import java.util.HashMap;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        // Create a hashmap to count frequency of each character
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        int result = 0;
        boolean hasOdd = false;

        // Iterate through the counts
        for (int count : countMap.values()) {
            if (count % 2 == 0) {
                // If even, we can use the whole count
                result += count;
            } else {
                // If odd, use count - 1 and mark that we have an odd
                result += count - 1;
                hasOdd = true;
            }
        }

        // If we had at least one odd count, we can put one character in the center
        if (hasOdd) {
            result += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "abccccdd";
        String s2 = "a";
        String s3 = "bb";
        String s4 = "Aa";

        // Run the function and print the results
        System.out.println("Longest palindrome length for 'abccccdd': " + longestPalindrome(s1)); // 7
        System.out.println("Longest palindrome length for 'a': " + longestPalindrome(s2));       // 1
        System.out.println("Longest palindrome length for 'bb': " + longestPalindrome(s3));      // 2
        System.out.println("Longest palindrome length for 'Aa': " + longestPalindrome(s4));      // 1
    }
}
