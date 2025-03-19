import java.util.*;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        List<int[]> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people.add(new int[]{heights[i], i}); // Store height and index
        }

        // Sort based on height in descending order
        people.sort((a, b) -> Integer.compare(b[0], a[0]));

        // Extract names in sorted order
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[people.get(i)[1]];
        }

        return sortedNames;
    }

    public static void main(String[] args) {
        // Sample input
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        // Calling the function
        String[] result = sortPeople(names, heights);

        // Printing the sorted names
        System.out.println("Sorted names: " + Arrays.toString(result));
    }
}
