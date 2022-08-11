package amazon;

import java.util.Arrays;

/**
 * Each input array is already sorted and A[i] < A [i + 1].
 * The lengths of the two input array can differ
 */
public class MergeSortedArrayList {

    public static void main(String[] args) {
        int[] first = {1, 3, 4};
        int[] second = {0, 4, 5, 6};
        int[] ans = merge(first, second);
        Arrays.stream(ans).forEach(System.out::print);
    }

    public  static int[] merge(int[] arr1, int[] arr2){
//        initialize the result array with length as sum of the length of the two input arrays
        int length1 = arr1.length;
        int length2 = arr2.length;
        int [] result = new int[length1 + length2];
//        initialize variables to be used for iteration
        int a = 0, b = 0, c = 0;

        while (a < length1 && b < length2 ){
            if (arr1[a] < arr2[b]){
                System.out.println(a +" index from first array");
                result[c++] = arr1[a++];
            }
            else{
                System.out.println(b+ " index from second array");
                result[c++] = arr2[b++];
            }
        }
//        when one array finishes before the other, loop through the remaining elements
        while (a < length1){
            System.out.println(a+" Remaining index from first array");
            result[c++] = arr1[a++];
        }
        while (b < length2){
            System.out.println(b+" Remaining index from second array");
            result[c++] = arr2[b++];
        }
        System.out.println(result.length+ " Length of final array");
        return result;
    }
}
