package java_learning;

import java.util.Arrays;

/**
 * This class is used to define the basic operations of a two-dimensional array
 */
public class TwoDimensionalArray {

    int[][] arr = null;
    public TwoDimensionalArray(int rows, int columns){
        arr = new int[rows][columns];
        for (rows = 0; rows < arr.length; rows++){
            for (columns = 0; columns < arr[rows].length; columns++){
                arr[rows][columns] = -1;
            }
        }
    }

    public void insertValue(int row, int column, int value){
        try {
            int currentValue = arr[row][column];
            if (currentValue != -1) {
                System.out.println("Position already occupied");
            } else {
                arr[row][column] = value;
                System.out.println("value successfully inserted");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid row or column number for array");
        }
    }

    public void accessCell(int row, int column) {
        int value;
        try {
            value = arr[row][column];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Cant access value: Invalid row or column number");
            return;
        }
        System.out.println(value+" is the value");
    }

    public void traverseArray(){
        int row;
        for (row = 0; row < arr.length; row++){
            int column;
            for (column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }

    public String searchForElement(int value){
        String message =value+" not found";
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length;column++){
                if (arr[row][column] == value){
                     message = value + " found at row: " + row + " and column: " + column;
                }
            }
        }
        return message;
    }

    static class Main{
        public static void main(String[] args) {
            TwoDimensionalArray array = new TwoDimensionalArray(2,2);
            System.out.println(Arrays.deepToString(array.arr));
            array.insertValue(1,1,4);
            System.out.println(Arrays.deepToString(array.arr));
            array.insertValue(1,1,4);
            array.insertValue(0,0,1);
            array.insertValue(0,1,2);
            array.insertValue(1,0,3);
            array.accessCell(0,1);
            System.out.println(array.arr.length+" is length of array");
            array.traverseArray();
            System.out.println(array.searchForElement(0));


        }
    }
}
