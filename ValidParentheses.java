import java.util.*;
public class ValidParentheses{
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
         for(char m : s.toCharArray()){
            if(m =='(' || m=='{' || m=='['){
                stack.push(m);
            }
            else{
                if(stack.isEmpty())
                    return false;

                    char top = stack.pop();
                    if((m == ')' && top != '(' || 
                        m == '}' && top != '{' ||
                        m == ']' && top != '[')){
                            return false;
                    }
                }
            }
            return stack.isEmpty();
         }
    
    public static void main(String[]args){
       // String s = "([{}])";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string of parentheses:");
         String s = sc.nextLine();
         
        System.out.println("Is valid parentheses: " + isValid(s));
    }
}