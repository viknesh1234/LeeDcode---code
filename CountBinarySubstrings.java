public class CountBinarySubstrings {

    public static void main(String[] args) {
        String s = "00110011";  // You can change this input for testing
        Solution sol = new Solution();
        int result = sol.countBinarySubstrings(s);
        System.out.println("Number of valid binary substrings: " + result);
    }
}

class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0, curr = 1, count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        count += Math.min(prev, curr);
        return count;
    }
}
