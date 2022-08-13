package amazon;

/**
 * Given an unsorted array A,
 * the maximum sum sub-array is the sub-array (contiguous elements) from A
 * for which the sum of the elements is maximum.
 * Find the sum of the maximum sub array
 */
public class SumMaximumSubArray {

    public static void main(String[] args) {
        int []input = {-1, 2, 3};
        System.out.println("Answer is "+findMaxSubArray(input));
    }
    public static int findMaxSubArray(int[] arr){
        if (arr.length < 1)
            return 0;

        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (currentMax < 0){
                System.out.println("I came here i is "+i+" and arr is "+arr[i]);
                currentMax = arr[i];
                System.out.println("Current max is "+currentMax);
            } else {
                System.out.println("I came to else instead i is "+i+" and arr is "+arr[i]);
                currentMax += arr[i];
                System.out.println("Current max is "+currentMax);
            }

            if (globalMax < currentMax){
                System.out.println(globalMax +" is less than "+currentMax);
                globalMax = currentMax;
            }
        }
        return globalMax;
    }
}

