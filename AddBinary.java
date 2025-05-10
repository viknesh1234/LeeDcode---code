import java.util.*;
public class AddBinary {
      public static String addBinary(String a, String b){
        StringBuilder sol = new StringBuilder();

        int i= a.length() -1;
        int  j= b.length() -1;
        int carry =0;

        while(i>=0 || j>=0 || carry!=0){
            int sum =0;
            if(i>=0){
                sum += a.charAt(i) -'0';
                i-- ;
           }
           if(j>=0){
            sum += b.charAt(j) -'0';
            j--;
           }
           sol.append(sum%2);
        carry = sum/2;
        }
        return sol.reverse().toString();
        
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String a = sc.nextLine();
        System.out.println("Enter the second binary number:");
        String b = sc.nextLine();
        String result = addBinary(a, b);
        System.out.println("The sum of the two binary numbers is: " + result);
    }
}
