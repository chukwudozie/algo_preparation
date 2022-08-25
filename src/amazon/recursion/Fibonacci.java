package amazon.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        System.out.println(fibonacci(8));

    }

    /**
     *Returns the fibonacci element at the nth index
     */
    public static int fibonacci(int n){
        if (n < 0){
            return 0;
        }
        if (n == 1 || n == 0){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
