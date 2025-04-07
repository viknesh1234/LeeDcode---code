public class Seosition {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = solution.searchInsert(nums, target);
        System.out.println("Output: " + result);
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int digit = left + (right - left) / 2;

            if (nums[digit] == target) {
                return digit;
            } else if (nums[digit] > target) {
                right = digit - 1;
            } else {
                left = digit + 1;
            }
        }
        return left;
    }
}

