package Day3.Assignment;

import java.util.Scanner;

public class CreditCardValidator {

    public static int[] getDigits(String cardNumber) {
        int[] digits = new int[cardNumber.length()];

        for (int i = 0; i < cardNumber.length(); i++) {
            digits[i] = Character.getNumericValue(cardNumber.charAt(i));
        }

        return digits;
    }


    public static String getCardType(int[] digits) {

        if (digits[0] == 4) {
            return "Visa";
        }

        if (digits[0] == 5 && (digits[1] == 1 || digits[1] == 2 || digits[1] == 3 || digits[1] == 4 || digits[1] == 5)) {
            return "Mastercard";
        }

        if (digits[0] == 3 && (digits[1] == 4 || digits[1] == 7)) {
            return "American Express";
        }

        if (digits[0] == 6 && digits[1] == 0 && digits[2] == 1 && digits[3] == 1) {
            return "Discover";
        }

        return "Unknown";
    }


    public static boolean luhnCheck(int[] digits) {
        int total = 0;

        for (int i = 0; i < digits.length; i++) {
            int currentNumber = digits[i];

            int positionFromRight = digits.length - 1 - i;

            if (positionFromRight % 2 == 1) {
                currentNumber = currentNumber * 2;

                if (currentNumber > 9) {
                    currentNumber = currentNumber - 9;
                }
            }

            total = total + currentNumber;
        }

        return total % 10 == 0;
    }


    public static void main(String[] args) {

        // Ask the user for their card number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify");
        String cardNumber = scanner.nextLine().trim();

        int[] digits = getDigits(cardNumber);
        String cardType = getCardType(digits);
        boolean isValid = luhnCheck(digits);
        int cardDigitLength = digits.length;

        // Print the results
        System.out.println("***********************************");
        System.out.println("Credit Card Type:" + cardType);
        System.out.println("Credit Card Number:" + cardNumber);
        System.out.println("Credit Card Digit Length:" + cardDigitLength);

        if (isValid) {
            System.out.println("Credit Card Validity Status: Valid");
        } else {
            System.out.println("Credit Card Validity Status: Invalid");
        }

        System.out.println("*************************************");

        scanner.close();
    }
}
