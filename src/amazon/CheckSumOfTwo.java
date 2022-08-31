package amazon;

import java.util.*;

/**
 * Given an array of integers and a value,
 * determine if there are two integers in array with sum equal to given value.
 * Return true if the sum exists and return false if it does not.
 * Consider this array and the target sums:
 */
public class CheckSumOfTwo {

    public static void main(String[] args) {
        int[] test1 = {1,3,5,7,8};
        int[] test2 = {4,5,6,7,1};
//        System.out.println(determineIfSumIsEqualToTarget(test1, 10));
        System.out.println("Answer 1 "+determineIfSumIsEqualToTarget(test2, 13));
        System.out.println("Answer 2 "+Arrays.toString(findPairs(test2, 13)));
    }

    public static boolean determineIfSumIsEqualToTarget(int[] input, int target){
        Set<Integer> foundValues = new HashSet<>();
        Map<Boolean,List<Integer>> result = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        boolean state = false;

        for (int j : input) {
            if (foundValues.contains(target - j)) {
                return true;
            }
            foundValues.add(j);
            output.add(j);
            result.put(true,output);


        }


        foundValues.forEach(System.err::println);
        result.forEach((k,y) -> System.out.println(k+" : "+y));
        return false;
    }

    public static int[] findPairs(int[] input, int target) {
        int [] output = new int[2];
        for (int i = 0; i < input.length; i++){
            for (int j = i+1; j < input.length; j++){
                if (input[i] + input[j] == target) {
                    output[0] = input[i];
                    output[1] = input[j];
                }
            }
        }
        return output;
    }
}
