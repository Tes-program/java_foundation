package Day5.MorningDrill;
import Day3.Assignment.Kata;

public class LCM {

    public static int factorizeNumber(int number) {
        int factor = 1;
        for (int divisor = 2; divisor <= number; divisor++) {
            while (number % divisor == 0) {
                factor *= divisor;
                number /= divisor;
            }
        }
        return factor;
    }
    public static int[] lcm(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = factorizeNumber(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] result = lcm(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
