package Day5.MorningDrill;


public class LCM {

    public static int lcm(int[] arr) {

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int candidate = max;
        while (true) {
            boolean isDivisibleByAll = true;

            for (int num : arr) {
                if (candidate % num != 0) {
                    isDivisibleByAll = false;
                    break;
                }
            }

            if (isDivisibleByAll) {
                return candidate;
            }

            candidate += max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println("LCM: " + lcm(arr));
    }
}
