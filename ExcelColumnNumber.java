import java.util.*;
public class ExcelColumnNumber {
    public static String convertToTitle(int columnNumber) {
        StringBuilder mv = new StringBuilder();
        while(columnNumber >0){
            columnNumber --;
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            mv.append(ch);
            columnNumber = columnNumber / 26;
        }
        return mv.reverse().toString();

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columnNumber = sc.nextInt();
        System.out.println("Excel Column Number: " + convertToTitle(columnNumber));
    }
}
