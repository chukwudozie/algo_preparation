package amazon;

import java.util.*;

/**
 * Given an array, find the first integer,
 * which is unique in the array.
 * Unique means the number does not repeat
 * and appears only once in the whole array.
 * Implement your solution in Java and see if it runs correctly!
 */
public class FirstUnique {

    public static void main(String[] args) {
        int [] numbers = {9, 2,3, 2, 6, 9,3, 6};
        System.out.println(findFirstUnique(numbers));
    }

    public static int findFirstUnique(int[] arr){

        boolean isRepeated = false;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < arr.length; j++){

                if (arr[i] == arr[j] && i != j){
                    System.out.println("I came here first when i is "+i +", j is "+j+" and the element is "+arr[i] );
                    isRepeated =true;
                    break;
                }

            } // inner loop ends
            if (!isRepeated){ // if the number has not been repeated at all
                System.out.println("I came for the answer when i is "+i+", is repeated is "+isRepeated);
                return arr[i];
            } else {
                System.out.println("I came here instead, is repeated is "+isRepeated+" value is "+arr[i]+" i is "+i);
                isRepeated = false;
            }
        }// end of outer loop
        return -1;

    }
}   
