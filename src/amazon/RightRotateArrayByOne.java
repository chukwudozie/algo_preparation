package amazon;

import java.util.Arrays;

/**
 * Given an array, can you rotate its elements once from right to left?
 * This means that the right-most elements will appear at the left-most position in the array.
 */
public class RightRotateArrayByOne {

    public static void main(String[] args) {
        int [] input = {1, 2, 3, 4};
        System.out.println(Arrays.toString(rotateByOneIndex(input)));

    }

    public static int [] rotateByOneIndex(int [] arr){
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--){
                arr[i] = arr[i -1];
        }
        arr[0] = last;
        return arr;
    }
}
