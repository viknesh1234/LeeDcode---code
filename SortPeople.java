import java.util.*;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        List<int[]> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people.add(new int[]{heights[i], i}); 
        }

        
        people.sort((a, b) -> Integer.compare(b[0], a[0]));

      
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[people.get(i)[1]];
        }

        return sortedNames;
    }

    public static void main(String[] args) {
       
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

      
        String[] result = sortPeople(names, heights);

    
        System.out.println("Sorted names: " + Arrays.toString(result));
    }
}
