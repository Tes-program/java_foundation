package Week3.Day8;

import java.util.Arrays;

public class SlidingWindow {

    public static int[] kLargest(int[] arr, int k) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Pick the last k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[arr.length - k + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 3, 2};
        int k = 3;

        int[] output = kLargest(arr, k);
        System.out.println(Arrays.toString(output));
        // Output: [5, 6, 9] ✅
    }
}