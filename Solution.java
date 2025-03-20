import java.util.*;

class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            try {
                max = Math.max(max, Integer.parseInt(strs[i]));
            } catch (Exception e) {
                max = Math.max(max, strs[i].length());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case
        String[] strs = {"alic3", "bob", "3", "4", "00000"};
        System.out.println("Maximum Value: " + solution.maximumValue(strs));
    }
}
