package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    static void FibonacciNumbers(int n){
        int n1 = 0, n2 = 1;
        int c = 0;

        while (c < n){
            System.out.println(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            c = c + 1;
        }
    }
    public static void main(String[] args) {
        int n = 40;
        FibonacciNumbers(n);
    }
}
