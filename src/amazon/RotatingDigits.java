package amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * We can rotate digits by 180 degrees to form new digits.
 * When 0, 1, 6, 8, 9 are rotated 180 degrees,
 * they become 0, 1, 9, 8, 6 respectively.
 * When 2, 3, 4, 5, and 7 are rotated 180 degrees,they become invalid.
 * A confusing number is a number that when rotated 180 degrees
 * becomes a different number with each digit valid
 * (Note that the rotated number can be greater than the original number.)
 * Given a positive integer N, return the number of confusing numbers between 1 and N inclusive
 */
public class RotatingDigits {

    public static void main(String[] args) {
        System.out.println(confusingNumber(111));
    }
    static Map<Integer, Integer>map = new HashMap<>();
    static int result= 0;
    public static int confusingNumber(int n){
        map.put(0,0);
        map.put(1, 1);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);
        helper(n,0);
        return result;
    }
    private static void  helper(int n, long num){
        if (isConfusingNumber(num)){
            System.out.println(num+" is confusing");
            result++;
        }
        for (Integer number: map.keySet()){
            long next = num * 10 + number;

            if (next <= n && next != 0){
                helper(n, next);
            }
        }
    }
    private static boolean isConfusingNumber(long n){
        long src = n;
        long res = 0;

        while (n > 0){
            res = res * 10 + map.get((int)n % 10);
            n /= 10;
        }

        return res != src;
    }
}
