// File: FizzBuzz.java

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 15; // You can change n here

        List<String> output = fizzBuzz(n);

        // Print the result
        System.out.println("FizzBuzz output for n = " + n + ":");
        for (String s : output) {
            System.out.println(s);
        }
    }
}
