public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Arrays will be sorted low to high
        int first;
        int second;
        if(data.length > 1) {
            for (int k = 0; k < data.length - 1; k++) {
                for (int i = 0; i < data.length - 1; i++) {
                    first = data[i];
                    second = data[i + 1];

                    if (first > second) {
                        data[i] = second;
                        data[i + 1] = first;
                    }
                    System.out.println(data[i]);
                }
                System.out.println(" ");
            }
        }


        //System.out.println(data[data.length - 1]);

    }
}
