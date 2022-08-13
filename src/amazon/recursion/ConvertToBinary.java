package amazon.recursion;

/**
 * Convert a given input number in decimal
 * to its binary equivalence using recursion
 */
public class ConvertToBinary {
    public static void main(String[] args) {
        System.out.println(convert(3));
    }

    public static int convert(int number){
        int ans = 0;
        if(number == 0){
            return ans;
        }
        ans += number % 2 + 10 * convert(number / 2);
        return ans;
    }
}
