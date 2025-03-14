import java.util.Scanner;

class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter sorted array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int result = searchInsert(nums, target);
        System.out.println("Target should be inserted at index: " + result);

        scanner.close();
    }
}

