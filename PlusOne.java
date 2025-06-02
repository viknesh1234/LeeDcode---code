import java.util.*;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Last digit la irundhu iterate pannuvom
        for (int i = n - 1; i >= 0; i--) {
            // If current digit < 9 na, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;  // One add panrom
                return digits; // Direct-a return pannalaam
            }

            // If digit == 9 na, adha 0 aakkiduvom and carry forward
            digits[i] = 0;
        }

        // If ellathum 9 irundhaa, like [9,9,9] → [1,0,0,0]
        int[] result = new int[n + 1];
        result[0] = 1; // Only first element 1, rest default 0
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9}; // Input
        int[] result = plusOne(digits);

        // Output print panrom
        System.out.println(Arrays.toString(result)); // [1, 0, 0, 0]
    }
}
