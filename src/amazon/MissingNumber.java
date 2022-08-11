package amazon;

/**
 *You are given an array of positive numbers from 1 to n,
 * such that all numbers from 1 to n are present except one number x.
 * You have to find x. The input array is not sorted.
 * Look at the below array and give it a try before checking the solution.
 */
public class MissingNumber {

    public static void main(String[] args) {

        int [] nums = {3, 7, 1, 2, 8, 4, 5};
        int [] nums2 = {3,2, 4, 5};
        System.out.println(findMissing(nums2)+": Is the answer");

    }

    public static int findMissing(int[] input){
        int sum = 0;
        int expected_length = input.length + 1;
        for (int j : input) {
            sum += j;
        }
        int actual_sum = (expected_length * (expected_length + 1)) / 2;
        return actual_sum - sum;
    }

    // Try to get the answer a different way
    public static int findMissing2(int[] input){
        int n = input.length;
        return -1;
    }


}
