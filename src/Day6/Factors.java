package Day6;

import java.util.Arrays;

public class Factors {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int[] smallestFactor(int number) {
        int smallest = number;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                // Get the smallest factor that can divide the number
                for (int j = i; j <= number; j++) {
                    if (number % j == 0) {
                        smallest = j;
                        return new int[] {smallest};
                    }
                }
            }
        }
        return new int[] {smallest};
    }

    public static void main(String[] args) {
        int[] factors = getFactors(12);
        System.out.println("Factors of 12: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        int[] smallestFactors = smallestFactor(12);
        System.out.println("\nSmallest factor of 12: " + Arrays.toString(smallestFactors));
    }
}
