package java_learning;

import java.util.Arrays;

/**
 * You are given an N by N 2D matrix representing an image,
 * rotate the image by 90 deg (clockwise)
 * Rotate in place, such that no new memory is allocated for the rotated matrix
 */
public class RotateMatrix {
    public static void main(String[] args) {
        int [][] practice = {{1,2,3,4}, {3,4,7,1},{9,6,8,4},{0,1,2,5}};
        print2DArray(practice);
        System.out.println("----");
        print2DArray(rotateArray(practice));


    }

    public static int[][] rotateArray(int [][] matrix){
        //if the matrix is not a square matrix return false, it cant be rotated
        if (matrix.length == 0 || matrix[0].length != matrix.length) return matrix;
        int n = matrix.length;

        for (int layer = 0; layer < n/2; layer++){
            System.out.println(layer+": is layer");
            System.out.println((n/2)+" is n / 2");
            int last = n - 1 - layer;
            for (int i = layer; i < last; i++) {
                int offset = i - layer;
                int top = matrix[layer][i];
                matrix[layer][i] = matrix[last - offset][layer];
                matrix[last - offset][layer] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return matrix;
    }

    public static void print2DArray(int [][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints)
                System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
