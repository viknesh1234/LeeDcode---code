// File: FirstUniqueCharacter.java
import java.util.*;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        // Step 1: Count the frequency of each character
        int[] count = new int[26]; // only lowercase English letters

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Find the first character with count == 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }

    public static void main(String[] args) {
        // Test examples
        String input1 = "leetcode";
        String input2 = "loveleetcode";
        String input3 = "aabb";

        System.out.println("Input: " + input1 + " -> Output: " + firstUniqChar(input1)); // 0
        System.out.println("Input: " + input2 + " -> Output: " + firstUniqChar(input2)); // 2
        System.out.println("Input: " + input3 + " -> Output: " + firstUniqChar(input3)); // -1
    }
}
