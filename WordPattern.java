import java.util.HashMap;

public class WordPattern {
    
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // Check if lengths are equal
        if (pattern.length() != words.length) {
            return false;
        }

        // Maps for bijection
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            // If the character has been mapped before
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;
                }
            } else {
                // If the word is already mapped to another character
                if (wordToChar.containsKey(w)) {
                    return false;
                }
                // Establish new mappings
                charToWord.put(c, w);
                wordToChar.put(w, c);
            }
        }

        return true;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Test case 1
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println("Test 1: " + wordPattern(pattern1, s1)); // true

        // Test case 2
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println("Test 2: " + wordPattern(pattern2, s2)); // false

        // Test case 3
        String pattern3 = "aaaa";
        String s3 = "dog dog dog dog";
        System.out.println("Test 3: " + wordPattern(pattern3, s3)); // true

        // Test case 4
        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        System.out.println("Test 4: " + wordPattern(pattern4, s4)); // false
    }
}
