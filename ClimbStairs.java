import java.util.Scanner;

class ClimbStairs {  
    public int ClimbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter number of stairs: ");
        
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
                return;
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        scanner.close();

        ClimbStairs solution = new ClimbStairs();
        int ways = solution.ClimbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}
