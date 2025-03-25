public class MissingNumber {
    // Function to find the missing number
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int total = (n * (n + 1)) / 2;

        for (int num : nums) {
            sum += num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {3, 0, 1};

        // Finding and displaying the missing number
        System.out.println("Missing Number: " + missingNumber(nums));
    }
}
