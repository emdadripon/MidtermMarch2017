package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("Using Recursion");
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * factorial(n - 1);
    }
    public int showIteration(){
            System.out.println("Using Iteration");
            int n = 5;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            int num = 5;
            int factorialnum = factorials(num);
            System.out.println(factorialnum);
         return n;
    }
    private static int factorials(int num) {
        if (num > 1)
            return num * factorials(num - 1);
        else

            return 1;
    }
}




