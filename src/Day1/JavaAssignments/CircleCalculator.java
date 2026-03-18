package Day1.JavaAssignments;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = scanner.nextInt();

        System.out.printf("Diameter: %d ", 2 * radius);
        System.out.printf("Circumference: %f ", 2 * 3.14159 * radius);
        System.out.printf("Area: %f ", 3.14159 * radius * radius);
    }
}