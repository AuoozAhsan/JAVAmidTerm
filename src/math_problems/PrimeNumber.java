package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */

    public static boolean primeNumber(int n){
        for (int i = 2; i <= n/i; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int minimum = 2, maximum = 1000000;
        for(int n = minimum; n <= maximum; n++){
            if(primeNumber(n)){
                System.out.println("Prime no from 2 to 100000 are ");
                System.out.print(n);
            }
        }
    }

}
