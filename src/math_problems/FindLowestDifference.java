package math_problems;

public class FindLowestDifference {

    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

     public int minimumArray1(int[] array1, int n){
       int a = array1[0];
       for(int i =1; i < n; i ++)
           a = Math.min(a, array1[i]);
       return a;
     }

    public int minimumArray2(int[] array2, int m){
        int b = array2[0];
        for(int i =1; i < m; i ++)
            b = Math.min(b, array2[i]);
        return b;
    }



        public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};



    }



}
