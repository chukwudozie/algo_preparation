package amazon;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array,
 * return an array where each index stores the product of all numbers
 * except the number on the index itself.
 * Implement your solution in Java and see if your output matches the expected output!
 */
public class ArrayOfProducts {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(products(new int[]{2, 4, 5})));
    }

    public static int[] products(int[]arr){
        int [] solution = new int[arr.length];
        int product = 1;
        int i;
        for ( i = 0; i < arr.length; i++){
//            for (int j = i +1; j < arr.length; j++){
//
//            }
            solution[i] = product;
            product *= arr[i];

        }

        System.out.println(i);
        System.out.println(product);
        System.out.println(Arrays.toString(solution));
        product = 1;
        for (i = arr.length - 1; i >=0; i--){
            solution[i] *= product;
            product *= arr[i];
        }

        return solution;
    }

}
