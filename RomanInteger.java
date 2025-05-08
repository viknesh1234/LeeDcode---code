import java.util.*;
public class RomanInteger {

    public static int roman(String mv){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);            
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = map.get(mv.charAt((mv.length()-1)));
        for(int i=mv.length()-2; i>=0; i--){
              int current =map.get(mv.charAt(i));// get the current character value
                int next = map.get(mv.charAt(i+1));// get the next character value

                if(current<next){
                    sum -=current;
                }
                else{
                    sum += current;
                }


        }
        return sum;
    }
   public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a Roman numeral: ");
    String mv = sc.nextLine().toUpperCase();

    int ans = roman(mv);{
        System.out.println("the numerical value "+ mv + " is "+ ans);
    }
   } 
}
