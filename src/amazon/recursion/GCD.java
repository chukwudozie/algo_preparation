package amazon.recursion;

/**
 * Calculate the greatest common divisor of two numbers using recursion
 * this solution uses the Euclidean algorithm
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println(findGCD(6, 4));
    }

    public static int findGCD(int n, int m){
        if (m == 0){
            return n;
        }
        if (m < 0 || n < 0){
            return 0;
        }
        return findGCD(m, n % m);
    }
}
