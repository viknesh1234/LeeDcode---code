import java.util.Arrays;

class CountingBits {
    public static int[] countBits(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = Integer.bitCount(i);
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 5;  
        int[] result = countBits(n);
        
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
