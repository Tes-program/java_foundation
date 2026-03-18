package Day1.JavaAssignments;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = inputCollector.nextInt();

        System.out.print("Enter second integer: ");
        int b = inputCollector.nextInt();

        System.out.print("Enter third integer: ");
        int c = inputCollector.nextInt();

        int sum = a + b + c;
        int average = sum / 3;
        int product = a * b * c;

        int smallest = a;
        if (b < smallest)
            smallest = b;
        if (c < smallest)
            smallest = c;

        int largest = a;
        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
