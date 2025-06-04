import java.util.*;

public class RansomNoteChecker {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test Case 1
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Test Case 1: " + canConstruct(ransomNote1, magazine1)); // false

        // Test Case 2
        String ransomNote2 = "aa";
        String magazine2 = "aab";
        System.out.println("Test Case 2: " + canConstruct(ransomNote2, magazine2)); // true

        // Test Case 3
        String ransomNote3 = "aa";
        String magazine3 = "ab";
        System.out.println("Test Case 3: " + canConstruct(ransomNote3, magazine3)); // false

        // Add more custom test cases as needed
    }
}
