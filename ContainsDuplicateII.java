import java.util.*;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true; // Found within range
                }
            }
            map.put(nums[i], i); // Update latest index
        }

        return false; // No nearby duplicate found
    }

    public static void main(String[] args) {
        ContainsDuplicateII sol = new ContainsDuplicateII();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = sol.containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate? " + result);
    }
}
