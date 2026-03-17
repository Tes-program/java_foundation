import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g. 0.84 for 0.84%): ");
        double rate = scanner.nextDouble() / 100;

        System.out.println("\nEstimated World Population:");
        System.out.println("-----------------------------");

        for (int year = 1; year <= 5; year++) {
            population = population + (population * rate);
            System.out.printf("After %d year(s): %f%n", year, population);
        }
    }
}