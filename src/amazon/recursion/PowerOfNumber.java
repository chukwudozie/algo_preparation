package amazon.recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(calculatePower(3, 4));
    }

    public static int calculatePower(int n, int power){
        if(power == 0)
            return 1;
        if (power == 1)
            return n;
        return n * calculatePower(n, power - 1);

    }
}
