import java.util.Scanner;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3 == 0 && n > 0) {
            for (int i = 0; Math.pow(3, i) <= n; i++) {
                if (Math.pow(3, i) == n) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if it's a power of three
        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of three.");
        } else {
            System.out.println(n + " is NOT a power of three.");
        }

        scanner.close();
    }
}
