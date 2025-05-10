import java.util.*;
public class HaystackNeedle {
       public int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
       }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HaystackNeedle find = new HaystackNeedle();
        System.out.println("Enter the haystack String : ");
        String haystack = sc.nextLine();
        System.out.println("Enter the needle string : ");
        String needle = sc.nextLine();
        int result = find.strStr(haystack, needle);
        System.out.println("Index of needle in haystack: " + result);
System.out.println("--------------------------------");
        // Test case 2
        System.out.println("Enter the haystack String 2 : ");
        String haystack1 = sc.nextLine();
        System.out.println("Enter the needle string 2 : ");
        String needle1 = sc.nextLine();
        int result1 = find.strStr(haystack1, needle1);
        System.out.println("Index of needle in haystack: " + result1);
            }   
}
