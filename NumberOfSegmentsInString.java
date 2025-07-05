public class NumberOfSegmentsInString {
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "Hello, my name is John";
        String s2 = "   ";
        String s3 = "OneWord";
        String s4 = "   Leading and trailing   ";

        System.out.println("Segments in s1: " + solution.countSegments(s1)); // Output: 5
        System.out.println("Segments in s2: " + solution.countSegments(s2)); // Output: 0
        System.out.println("Segments in s3: " + solution.countSegments(s3)); // Output: 1
        System.out.println("Segments in s4: " + solution.countSegments(s4)); // Output: 3
    }
}

class Solution {
    public int countSegments(String s) {
        // Remove leading and trailing whitespaces
        String trimmed = s.trim();

        // If the trimmed string is empty, return 0
        if (trimmed.isEmpty()) {
            return 0;
        }

        // Split by one or more whitespace characters
        String[] segments = trimmed.split("\\s+");
        return segments.length;
    }
}
