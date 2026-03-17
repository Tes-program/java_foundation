import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            System.out.print("Enter score " + (count + 1) + ": ");
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                sum += score;
                count++;
            } else {
                System.out.println("Invalid! Score must be between 0 and 100. Try again.");
            }
        }

        System.out.println("Sum of scores: " + sum);
    }
}
