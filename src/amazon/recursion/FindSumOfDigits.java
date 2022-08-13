package amazon.recursion;

/**
 * Find the sum of digits of a number using recursion
 * Contstraint: The number is positive
 */
public class FindSumOfDigits {
    public static void main(String[] args) {
        System.out.println(findSumOfDigits(591));
    }

    public static int findSumOfDigits(int number){
        if (number <=0){
            return 0;
        }
        return number % 10 + findSumOfDigits(number/10);
    }
}
