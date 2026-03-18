package Day1.JavaAssignments;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = inputCollector.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = inputCollector.nextInt();

        int squareOfFirstNumber = firstNumber * firstNumber;

        int squareOfSecondNumber = secondNumber * secondNumber;

        int sumOfSquares = squareOfFirstNumber + squareOfSecondNumber;

        int differenceOfSquares = squareOfFirstNumber - squareOfSecondNumber;


        System.out.println("The square of the first number is: " + squareOfFirstNumber);
        System.out.println("The square of the second number is: " + squareOfSecondNumber);
        System.out.println("The sum of the squares is: " + sumOfSquares);
        System.out.println("The difference of the squares is: " + differenceOfSquares);

    }
}