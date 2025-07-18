import java.util.*;

public class MinimumIndexSum {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Store all elements from list1 with their indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // Iterate through list2 to find the minimum index sum
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);
                if (sum < minSum) {
                    result.clear();
                    result.add(list2[j]);
                    minSum = sum;
                } else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        String[] commonRestaurants = findRestaurant(list1, list2);

        System.out.println("Common restaurants with minimum index sum:");
        for (String restaurant : commonRestaurants) {
            System.out.println(restaurant);
        }
    }
}
