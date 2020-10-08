
public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution

        //Help from DZone.com

        int l = 0; // leftmost number
        int r = data.length - 1; // rightmost number
        int mid; // middle number

        while(l <= r){
            mid = (l + r) / 2; // middle gets set

            if (data[mid] < target){ // if number is in upper half
                l = mid + 1;
            }
            else if (data[mid] > target){ // if number is in lower half
                r = mid - 1;
            }
            else{
                return mid; // if the target number is mid
            }
        }
        return -1;


    }
}
