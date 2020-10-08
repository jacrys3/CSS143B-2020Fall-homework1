public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Arrays will be sorted low to high

        int first; // left number
        int second; // right number

        if(data.length > 1) { // checks if the array is empty

            for (int k = 0; k < data.length - 1; k++) { // goes through the sort one less time than the length of the array

                for (int i = 0; i <= data.length - 1; i++) { // sorts the numbers once through

                    if(i == data.length - 1){ // this is for the last number in the array so it can get sorted and not left out
                        first = data[i - 1];
                        second = data[i];
                    }
                    else{ // else sort normally
                        first = data[i];
                        second = data[i + 1];
                    }

                    if (first > second) { // checks if left number is greater than right number
                        data[i] = second;
                        data[i + 1] = first;
                    }
                }
            }
        }
    }
}
