package Day3.Assignment;

import java.util.Scanner;
import java.util.Date;

public class Checkout {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemNames = new String[100];
        int[] itemQuantities = new int[100];
        double[] itemPrices = new double[100];
        int totalItems = 0;

        System.out.print("What is the customer's Name: ");
        String customerName = scanner.nextLine();

        int menuChoice = 1;

        while (menuChoice == 1) {
            System.out.print("What did the user buy? ");
            itemNames[totalItems] = scanner.nextLine();

            System.out.print("How many pieces? ");
            itemQuantities[totalItems] = Integer.parseInt(scanner.nextLine());

            System.out.print("How much per unit? ");
            itemPrices[totalItems] = Double.parseDouble(scanner.nextLine());

            totalItems = totalItems + 1;

            System.out.println("Add more Items?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice: ");
            menuChoice = Integer.parseInt(scanner.nextLine());

            switch (menuChoice) {
                case 1:
                    System.out.println("Ok, let's add another item.");
                    break;
                case 2:
                    System.out.println("Ok, let's proceed to checkout.");
                    break;
                default:
                    System.out.println("Invalid choice, proceeding to checkout.");
                    menuChoice = 2;
                    break;
            }
        }

        System.out.print("What is your name? (Cashier): ");
        String cashierName = scanner.nextLine();

        System.out.print("How much discount will the customer get? (in %): ");
        double discountPercent = Double.parseDouble(scanner.nextLine());

        double subTotal = 0;
        for (int i = 0; i < totalItems; i++) {
            subTotal = subTotal + (itemQuantities[i] * itemPrices[i]);
        }

        double discountAmount = (discountPercent / 100) * subTotal;
        double vatAmount = (17.5 / 100) * subTotal;
        double billTotal = subTotal - discountAmount + vatAmount;

        Date currentDate = new Date();

        System.out.println("==========================================================================================================");
        System.out.println("              SEMICOLON STORES");
        System.out.println("              MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293820343");
        System.out.println("Date : " + currentDate);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("=============================================================================================================");
        System.out.printf("%-20s %-6s %-10s %-10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < totalItems; i++) {
            double itemTotal = itemQuantities[i] * itemPrices[i];
            System.out.printf("%-20s %-6d %-10.2f %-10.2f%n",
                    itemNames[i], itemQuantities[i], itemPrices[i], itemTotal);
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%-30s %.2f%n", "Sub Total:", subTotal);
        System.out.printf("%-30s %.2f%n", "Discount:", discountAmount);
        System.out.printf("%-30s %.2f%n", "VAT @ 17.50%:", vatAmount);
        System.out.println("==========================================================================================================");
        System.out.printf("%-30s %.2f%n", "Bill Total:", billTotal);
        System.out.println("===========================================================================================================");
        System.out.println("THIS IS NOT A RECEIPT. KINDLY PAY " + billTotal);
        System.out.println("============================================================================================================");

        System.out.print("How much did the customer give to you? ");
        double amountPaid = Double.parseDouble(scanner.nextLine());

        double balance = amountPaid - billTotal;

        System.out.println("==============================================================================================================");
        System.out.printf("%-30s %.2f%n", "Bill Total:", billTotal);
        System.out.printf("%-30s %.2f%n", "Amount Paid:", amountPaid);
        System.out.printf("%-30s %.2f%n", "Balance:", balance);
        System.out.println("================================================================================================================");
        System.out.println("         THANK YOU FOR YOUR PATRONAGE");
        System.out.println("==================================================================================================================");

        scanner.close();
    }
}