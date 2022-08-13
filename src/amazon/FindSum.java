package amazon;

import java.util.Arrays;

public class FindSum {

    public static void main(String[] args) {
        int []num1 = {2,4,6,7,8,9,0};
        System.out.println(Arrays.toString(findSum(num1, 12)));
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /**
     * QUICK SORT
     */
    public static void sort(int[]arr, int low, int high){
        if (low < high){
            int p = partition(arr,low,high);
            sort(arr,low,p - 1);
            sort(arr, p+1,high);
        }
    }

    /**
     *This method uses Brute Force with time complexity of 0(n^2)
     */
    public static int[] findSum(int[] arr, int n){
        int []result = new int[2];
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == n){
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }
        return arr;



    }

    /**
     *This method uses Quick sort with complexity of O(nlogn)
     */
    public static int[] findSumByQuickSort(int[] arr, int n){
                Arrays.stream(arr).forEach(System.err::println);
        sort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
        int pointer1 = 0;
        int pointer2 = arr.length - 1;
        int []result = new int[2];
        int sum = 0;

        while (pointer1 != pointer2){

            sum = arr[pointer1] + arr[pointer2];

            if (sum < n){
                pointer1++;
                System.out.println(pointer1+" pointer");
            }
            else if (sum > n)
                pointer2--;
            else {
                result[0] = pointer1;
                result[1] = pointer2;
                return result;
            }
        }
        return arr;
    }
}
