public class ReverseStringII {

    // Method to reverse first k characters for every 2k block
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return new String(arr);
    }

    // Main method to test the function
    public static void main(String[] args) {
        String input1 = "abcdefg";
        int k1 = 2;
        System.out.println("Input: " + input1 + ", k = " + k1);
        System.out.println("Output: " + reverseStr(input1, k1));

        String input2 = "abcdefghij";
        int k2 = 3;
        System.out.println("Input: " + input2 + ", k = " + k2);
        System.out.println("Output: " + reverseStr(input2, k2));
    }
}
