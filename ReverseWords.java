import java.util.Scanner;

public class ReverseWords {

    // Function to reverse each word in the input string
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Input from user using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Call the function and display result
        String output = reverseWords(input);
        System.out.println("Reversed Words: " + output);

        sc.close();
    }
}
