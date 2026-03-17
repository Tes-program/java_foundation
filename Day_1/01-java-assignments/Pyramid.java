import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter estimated number of stones: ");
        int stones = scanner.nextInt();

        System.out.print("Enter average weight of each stone (in pounds): ");
        int stoneWeight = scanner.nextInt();

        System.out.print("Enter number of years to build: ");
        int years = scanner.nextInt();

        int totalWeight  = stones * stoneWeight;
        int hoursInAYear = 365 * 24;
        int minutesInAYear = hoursInAYear * 60;

        System.out.println("\n--- Pyramid Build Rate ---");
        System.out.printf("Total weight          : %d pounds%n", totalWeight);
        System.out.printf("Weight per year       : %d pounds%n", totalWeight / years);
        System.out.printf("Weight per hour       : %d pounds%n", totalWeight / (years * hoursInAYear));
        System.out.printf("Weight per minute     : %d pounds%n", totalWeight / (years * minutesInAYear));
    }
}