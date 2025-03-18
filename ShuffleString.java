import java.util.*;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];  
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);  
        }
        return new String(result);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the string: ");
        String s = scanner.next();

        System.out.print("Enter the indices (space-separated): ");
        int[] indices = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            indices[i] = scanner.nextInt();
        }

        // Calling the function and printing the result
        String shuffledString = restoreString(s, indices);
        System.out.println("Shuffled String: " + shuffledString);

        scanner.close();
    }
}
