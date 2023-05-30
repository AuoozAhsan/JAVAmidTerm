package math_problems;
import java.util.Arrays;

class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static int missingNumber(int[] array, int n){
        int size = array.length;
        int missingNum = size + 1;
        int sum = missingNum * (missingNum + 1) / 2;

        //int actualSum = Arrays.stream(array).actualSum();
        for(int i = 0; i < n; i ++)
            sum -= array[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int size = array.length;

        System.out.println("The number missing is " + missingNumber(array, size));

    }
}
