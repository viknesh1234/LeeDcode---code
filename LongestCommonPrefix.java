import java.util.*;
public class LongestCommonPrefix{
    public static String longestCommonPrefix(String[] strs){
        if(strs.length ==0 || strs == null){
            return "";
        }

        String prefix = strs[0];

        for(int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty())
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] input = new String[n];
        System.out.println("Enter the strings:");
        for(int i=0; i<n; i++){
            input[i] =sc.nextLine();
        }
        String result = longestCommonPrefix(input);
        System.out.println("Longest common prefix: " + result);
    }
}