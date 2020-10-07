import java.util.Arrays;

public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        /*int mid = data.length/2;

        if(data.length == 0){
            return -1;
        }
        else if (data.length == 1 && data[0] == target){
            return 0;
        }
        else if(target == data[mid]){
            return mid - 1;
        }
        else if (data.length > 1 && data[mid] > target){
            int[] copy = Arrays.copyOfRange(data, mid, data.length);
            return binarySearch(copy, target);
        }
        else if (data.length > 1 && data[mid] < target){
            int[] copy = Arrays.copyOfRange(data, 0, mid);
            return binarySearch(copy, target);
        }
        else {
            return -1;
        }*/

        int l = 0;
        int r = data.length - 1;
        int mid;

        while(l <= r){
            mid = (l + r) / 2;

            if (data[mid] < target){
                l = mid + 1;
            }
            else if (data[mid] > target){
                r = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;


    }
}
