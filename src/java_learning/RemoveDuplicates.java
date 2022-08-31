package java_learning;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,5};
        int [] arr2 = {1,2,1,2,2,3,4,6,7,8,5,9};
        int [] newInt = removeDuplicates(arr2);
        System.out.println(Arrays.toString(newInt));
    }

    /**
     * This method only removes duplicates when they occur together,
     * hence the sort enables to remove duplicates no matter the position
     */
    private static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int newLength;
        int j = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++){
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[n - 1];
        newLength = j;
        int []newArray = new int[newLength];
        System.arraycopy(arr, 0, newArray, 0, newLength);
        return newArray;
    }
}
