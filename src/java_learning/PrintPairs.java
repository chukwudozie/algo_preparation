package java_learning;

import java.util.Arrays;

public class PrintPairs {
    public static void main(String[] args) {
        int [] num = {1, 3, 4, 5};
        System.out.println(Arrays.toString(printPairs(num)));
        //Expected:  11, 13, 14, 15, 31, 33, 34, 35, 41, 43, 44, 45, 51, 53, 54, 55
    }

    public static int[] printPairs(int[] arr) {
        int [] newArr = new int[arr.length * arr.length];
        int count = 0;
        for (int k : arr) {
            for (int i : arr) {
                String sb = String.valueOf(k) + i;
                newArr[count++] = Integer.parseInt(sb);
            }
        }
        return newArr;
    }
}
