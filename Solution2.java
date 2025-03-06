import java.util.*;

public class Solution2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean left = (i == 0 || flowerbed[i - 1] == 0);
            boolean right = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
            
            if (left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
                
                if (n <= 0) return true;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println("Can place flowers: " + solution.canPlaceFlowers(flowerbed, n));
    }
}

