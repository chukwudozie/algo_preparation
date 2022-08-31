package java_learning;

import java.util.Arrays;

/**
 * This class is used to define the basic operations of a single dimensional array
 */
public class SingleDimensionalArray {
    int[] arr = null;

    public SingleDimensionalArray(int size) {
        arr = new int[size];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println(value + " inserted at location " + location);
            } else {
                System.out.println("location already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        }
    }

    public String printArray() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Arrays.stream(arr).forEach(value ->
        {
            if (value == arr[arr.length - 1])
                sb.append(value).append("]");
            else
                sb.append(value).append(" ");

        });
        return sb.toString();
    }

    public String search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return value + " found at index " + i;
            }
        }
        return value + " not found";
    }

    static class Main {
        public static void main(String[] args) {
            SingleDimensionalArray array = new SingleDimensionalArray(5);
            array.insert(0, 2);
            array.insert(2, 2);
            array.insert(0, 1);
            array.insert(5, 1);
            array.insert(1, 2);
            array.insert(2, 3);
            array.insert(3, 4);
            array.insert(4, 8);

            System.out.println(array.printArray());

            System.out.println(array.search(4));
        }
    }
}
