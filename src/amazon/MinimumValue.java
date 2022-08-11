package amazon;

public class MinimumValue {
    public static void main(String[] args) {
        int [] sample = {1, 2, 3, 0};
        System.out.println(findMinimumValue(sample));
    }

    // COmplexity: O(n)
    public static int findMinimumValue(int []arr){
        int min = arr[0];
        if (arr.length == 1){
            return min;
        }

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
