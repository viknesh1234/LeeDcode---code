public class ConvertToHex {

    public static String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        while (num != 0 && sb.length() < 8) {
            int hexDigit = num & 15; // Get last 4 bits
            sb.append(hexChars[hexDigit]);
            num >>>= 4; // Unsigned shift for proper handling of negatives
        }

        return sb.reverse().toString();
    }

    // Main method for local testing
    public static void main(String[] args) {
        int[] testNumbers = {26, -1, 0, 123456, -255};

        for (int num : testNumbers) {
            System.out.println("Decimal: " + num + " -> Hex: " + toHex(num));
        }
    }
}
