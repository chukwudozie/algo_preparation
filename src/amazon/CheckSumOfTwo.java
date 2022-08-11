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
        System.out.println(determineIfSumIsEqualToTarget(test2, 1));
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

        System.out.println("gbf");
        foundValues.forEach(System.err::println);
        result.forEach((k,y) -> System.out.println(k+" : "+y));

        return false;

    }
}
