package amazon;

import java.util.Arrays;

/**
 * Given an array,
 * can you re-arrange its elements in such a way
 * that the negative elements appear at one side
 * and positive elements appear at the other
 */
public class RearrangeArray {
    public static void main(String[] args) {
        int[] input = {10, -1, 20, 4, 0, 5, -9, -6};
        System.out.println(Arrays.toString(rearrange(input)));
        rearrange2(input);
        System.err.println(Arrays.toString(input));
    }

    public static int[] rearrange(int[] arr){
        int start = 0;
        int[] rearrangedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0)
                rearrangedArray[start++] = arr[i];
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= 0)
                rearrangedArray[start++] = arr[i];
        }

        for (int j = 0;  j < start; j++){
            arr[j] = rearrangedArray[j];
        }
        return arr;
    }

    public static void rearrange2(int [] arr){
        int j = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                if (i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
