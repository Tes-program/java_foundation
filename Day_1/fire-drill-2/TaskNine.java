import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                sum += score;
            }
        }

        System.out.println("Sum of valid scores: " + sum);
    }
}
