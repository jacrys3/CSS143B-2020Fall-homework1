import java.util.Arrays;

public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int mid = data.length/2;

        if(data == null || data.length == 0){
            return -1;
        }
        else if(target == data[mid]){
            return mid;
        }
        else if (data[mid] > target){
            int[] copy = Arrays.copyOfRange(data, mid, data.length);
            return binarySearch(copy, target);
        }
        else{
            int[] copy = Arrays.copyOfRange(data, 0, mid);
            return binarySearch(copy, target);
        }

    }
}
