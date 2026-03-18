package Day3;

import java.util.Scanner;

public class MultiplyProduct {
    public static void main(String[] args) {
        int productNum = 0;
        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = inputNum.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = inputNum.nextInt();

        int absFirst;
        int absSecond;

        if (firstNumber < 0) {
            absFirst = -firstNumber;
        } else {
            absFirst = firstNumber;
        }

        if (secondNumber < 0) {
            absSecond = -secondNumber;
        } else {
            absSecond = secondNumber;
        }

        for (int i = 1; i <= absSecond; i++) {
            productNum = productNum + absFirst;
        }

        if (firstNumber < 0 && secondNumber > 0) {
            productNum = -productNum;
        } else if (firstNumber > 0 && secondNumber < 0) {
            productNum = -productNum;
        }

        System.out.printf("The product of %d and %d is %d", firstNumber, secondNumber, productNum);
    }
}
