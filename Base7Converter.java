public class Base7Converter {

    // Method to convert integer to base 7
    public static String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (isNegative) sb.append('-');
        return sb.reverse().toString();
    }

    // Main method to run and test
    public static void main(String[] args) {
        int input1 = 100;
        int input2 = -7;
        int input3 = 0;

        System.out.println("Base 7 of " + input1 + " = " + convertToBase7(input1));  // Output: 202
        System.out.println("Base 7 of " + input2 + " = " + convertToBase7(input2));  // Output: -10
        System.out.println("Base 7 of " + input3 + " = " + convertToBase7(input3));  // Output: 0
    }
}
