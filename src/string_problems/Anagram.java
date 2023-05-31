package string_problems;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word: ");
        String word1 = input.nextLine();
        System.out.println("Enter your second word: ");
        String word2 = input.nextLine();

        if(word1.length() == word2.length()) {
            char[] charWord1 = word1.toCharArray();
            char[] charWord2 = word2.toCharArray();

            Arrays.sort(charWord1);
            Arrays.sort(charWord2);

            boolean isEqual = Arrays.equals(charWord1, charWord2);
            if (isEqual) {
                System.out.println(word1 + " and " + word2 + " are anagram");

            } else {
                System.out.println(word1 + " and " + word2 + " are not anagram");
            }
        }



    }

}
