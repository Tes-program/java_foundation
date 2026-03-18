package Day2.FireDrill2;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int validCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                sum += score;
                validCount++;
            }
        }

        System.out.println("Sum of valid scores: " + sum);

        if (validCount > 0) {
            double average = (double) sum / validCount;
            System.out.printf("Average of valid scores: %f", average);
        } else {
            System.out.println("No valid scores were entered.");
        }
    }
}
