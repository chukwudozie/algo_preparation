package amazon;

/**
 * We are given an array of integers, nums, sorted in ascending order,
 * and an integer value, target. If the target exists in the array,return its index.
 * If the target does not exist, then return -1.
 */
public class BinarySearchForArrays {
    public static void main(String[] args) {
    int [] input = {-1, 0, 3, 5, 9, 12,16};
        System.out.println("Answer "+searchForTarget(input, 9));
        System.out.println("Answer is "+ searchForTargetWithRecursion(input, 9));
    }

    public static int searchForTarget(int [] sortedArray, int target){

        int low = 0;
        int high = sortedArray.length -1;

        while (low <= high){

//            Use floor division to find the middle number
            int mid = low  + ((high - low) / 2);
            System.out.println("Middle number for iteration "+mid);

            if (sortedArray[mid] == target){
                System.out.println("I came here, target found and is "+sortedArray[mid]);
                return mid;
            }
            else if (target < sortedArray[mid]){
                high = mid - 1;
                System.out.println("I came here, target towards left of center, new high "+high);
            }
            else if (target > sortedArray[mid]){
                low = mid + 1;
                System.out.println("I came here, target towards right of center, new high "+high);
            }
        }
        return -1;
    }

    public static int searchForTargetWithRecursion(int [] sortedArray, int target, int high, int low){

        int output =0;
        if (low > high){
            output = -1;
        }


        int middle = low + ((high - low)/2);

        if (sortedArray[middle] == target){
            output =  middle;
        }
        else if (target < sortedArray[middle]){
            // move to the left
            output = searchForTargetWithRecursion(sortedArray,target,low,middle - 1);
        }
        else if (target > sortedArray[middle]) {
            // move to the right
            output = searchForTargetWithRecursion(sortedArray,target,middle + 1, high);
        }
         return output;
    }

    public static int searchForTargetWithRecursion(int [] sortedArray, int target){
        return searchForTargetWithRecursion(sortedArray,target,0,sortedArray.length - 1);
    }


}
