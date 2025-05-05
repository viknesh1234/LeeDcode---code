import java.util.*;
public class HappyNumber {
    public boolean isHappy (int n){
         Set<Integer> set = new HashSet<>();
            while (n!=1 && !set.contains(n)){
                set.add(n);
                int sum =0;

                while(n!=0){
                    int num = n%10;
                    sum += num*num;
                    n /= 10;
                }
                n = sum;
            }
            return n==1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        HappyNumber mv = new HappyNumber();
        int n = sc.nextInt();

        if(mv.isHappy(n)){
            System.out.println(n + " is a happy number.");
    }else{
            System.out.println(n + " is not a happy number.");
        }
    }
}
