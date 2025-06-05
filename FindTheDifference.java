// File: FindTheDifference.java
public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        // XOR approach
        char result = 0;

        // XOR all characters in both strings
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "abcd";
        String t1 = "abcde";

        String s2 = "";
        String t2 = "y";

        System.out.println("Input: s = \"" + s1 + "\", t = \"" + t1 + "\" -> Output: " + findTheDifference(s1, t1)); // e
        System.out.println("Input: s = \"" + s2 + "\", t = \"" + t2 + "\" -> Output: " + findTheDifference(s2, t2)); // y
    }
}
