package math_problems;

import javax.swing.*;

public class Factorial {
    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    static int factorial(int f)
    {
        if ( f== 0)
            return 1;

        return f * factorial(f - 1);
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println("Factorial of " + number + " is "+ factorial(7));
    }

}
