import java.util.*;

public class Solution1 {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false; // Perfect numbers are greater than 1
        int total = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        
        return total == num;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int num = 28; // Example test case
        System.out.println("Is " + num + " a perfect number? " + solution.checkPerfectNumber(num));
    }
}

