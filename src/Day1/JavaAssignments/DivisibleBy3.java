package Day1.JavaAssignments;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = inputCollector.nextInt();

        if (number % 3 == 0)
            System.out.println(number + " is divisible by 3");
        else
            System.out.println(number + " is not divisible by 3");
    }
}
