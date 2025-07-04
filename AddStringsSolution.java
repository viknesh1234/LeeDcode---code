public class AddStringsSolution {

    // Leetcode 415: Add Strings
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        // Simulate manual addition from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            result.append(sum % 10);
            i--;
            j--;
        }

        return result.reverse().toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        AddStringsSolution solution = new AddStringsSolution();

        // Sample test cases
        String num1 = "456";
        String num2 = "77";

        String result = solution.addStrings(num1, num2);
        System.out.println("Sum: " + result); // Output: "533"
    }
}
