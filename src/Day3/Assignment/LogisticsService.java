package Day3.Assignment;

import java.util.Scanner;

public class LogisticsService {

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter the number of successful deliveries: ");
        int successfulDelivery = inputNum.nextInt();
        int totalPay = calculatePay(successfulDelivery);
        System.out.println("Total pay: " + totalPay);
    }

    public static int calculatePay(int successfulDelivery) {
        int amountRate;
        int base_pay = 5000;
        int amountPaid = 0;
        if (successfulDelivery < 50) {
            amountRate = 160;
            amountPaid= base_pay + (successfulDelivery * amountRate);
        } else if (successfulDelivery <= 59) {
            amountRate = 200;
            amountPaid= base_pay + (successfulDelivery * amountRate);
        } else if (successfulDelivery <= 69) {
            amountRate = 250;
            amountPaid= base_pay + (successfulDelivery * amountRate);
        } else {
            amountRate = 500;
            amountPaid= base_pay + (successfulDelivery * amountRate);
        }
        return amountPaid;
    }
}
