public class ExcelColumnConverter {

    // Method to convert Excel title to number
    public static int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input1 = "A";
        String input2 = "Z";
        String input3 = "AB";
        String input4 = "ZY";

        System.out.println("Column " + input1 + " → " + titleToNumber(input1)); // 1
        System.out.println("Column " + input2 + " → " + titleToNumber(input2)); // 26
        System.out.println("Column " + input3 + " → " + titleToNumber(input3)); // 28
        System.out.println("Column " + input4 + " → " + titleToNumber(input4)); // 701
    }
}
