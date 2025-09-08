import java.util.*;
public class LeapYr {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.dayOfYear("2019-01-09")); 
        System.out.println(sol.dayOfYear("2019-02-10")); 
        System.out.println(sol.dayOfYear("2000-03-01")); 
    }
}

class Solution {
    public int dayOfYear(String date) {
        String[] d = date.split("-");
        int yr = Integer.parseInt(d[0]);
        int mm = Integer.parseInt(d[1]);
        int dd = Integer.parseInt(d[2]);
        int[] td = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0)) {
            td[1] = 29;
        }
        int tds = 0;
        for (int i = 0; i < mm - 1; i++) {
            tds += td[i];
        }
        return tds + dd;
    }
}
