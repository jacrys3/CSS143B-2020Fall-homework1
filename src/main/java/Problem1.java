
public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution

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
