class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            
            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(chars);
    }
}

public class ReverseVowels {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String input1 = "IceCreAm";
        String input2 = "hello";
        String input3 = "leetcode";

        System.out.println("Input: " + input1 + " -> Output: " + solution.reverseVowels(input1)); 
        System.out.println("Input: " + input2 + " -> Output: " + solution.reverseVowels(input2)); 
        System.out.println("Input: " + input3 + " -> Output: " + solution.reverseVowels(input3)); 
    }
}
