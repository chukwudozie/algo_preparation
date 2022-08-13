package amazon;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Given an array of size n,
 * can you find the second maximum element in the array?
 * Implement your solution in Java and see if your output matches the correct output!
 * Assumption: Array should contain at least two unique numbers
 */
public class FindSecondMaximum {

    public static void main(String[] args) {
        int [] input = {9, 2, 3, 6, 19, 24, 0};
//        System.out.println(findSecondMaximum(input));
        System.out.println(findSecondMaximum2(input));

    }

    public static int findSecondMaximum(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                int temp = 0;
                if(arr[j] > arr[i]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(System.err::println);
        return arr[1];
    }

    public static int findSecondMaximum2(int[] arr){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

//        Loop through the array to get the maximum
        for (int j : arr) {
            if (j > max)
                max = j;
        }

        for (int j : arr) {
            if (j > secondMax && j < max) {
                secondMax = j;
            }
        }
        return secondMax;
    }
}
