package string_problems;

import java.util.Scanner;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = stdin.nextLine();

        // Convert the string to lowercase
        word = word.toLowerCase();
        boolean A = isPalindrome(word);
        System.out.println(A);

    }

    // Implement here
    public static boolean isPalindrome(String word)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

        // Checking if both the strings are equal
        if (word.equals(rev)) {
            ans = true;
        }
        return ans;
    }

}
