package Day3.Assignment;

import java.util.Arrays;

public class ArrayKata {

    public static int maximumIn(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimumIn(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sumOf(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int sumOfEvenNumbersIn(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static int sumOfOddNumbersIn(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static int[] maximumAndMinimumOf(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] result = {min, max};
        return result;
    }

    public static int noOfOddNumbersIn(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int noOfEvenNumbersIn(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int[] evenNumbersIn(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = count + 1;
            }
        }

        int[] result = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index = index + 1;
            }
        }
        return result;
    }

    public static int[] oddNumbersIn(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count = count + 1;
            }
        }

        int[] result = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index = index + 1;
            }
        }

        return result;
    }

    public static int[] squareNumbersIn(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int root = (int) Math.sqrt(arr[i]);
            if (root * root == arr[i]) {
                count = count + 1;
            }
        }

        int[] result = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int root = (int) Math.sqrt(arr[i]);
            if (root * root == arr[i]) {
                result[index] = arr[i];
                index = index + 1;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 25, 16, 7};
        System.out.println(maximumIn(arr));
        System.out.println(minimumIn(arr));
        System.out.println(sumOf(arr));
        System.out.println(sumOfEvenNumbersIn(arr));
        System.out.println(sumOfOddNumbersIn(arr));
        System.out.println(Arrays.toString(maximumAndMinimumOf(arr)));
        System.out.println(noOfOddNumbersIn(arr));
        System.out.println(noOfEvenNumbersIn(arr));
        System.out.println(Arrays.toString(evenNumbersIn(arr)));
        System.out.println(Arrays.toString(oddNumbersIn(arr)));
        System.out.println(Arrays.toString(squareNumbersIn(arr)));
    }
}
