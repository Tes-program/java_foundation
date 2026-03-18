package Day2.FireDrill2;

import java.util.Scanner;

public class TaskThree {
        public static void main(String[] args) {
                int sum = 0;
                Scanner inputNum = new Scanner(System.in);
                System.out.println("Enter 10 scores: ");


                for (int i = 0; i < 10; i++) {
                        System.out.print("Score " + (i + 1) + " : ");

                        int num = inputNum.nextInt();

                        sum =  sum + num;
                }

		int average = sum / 10;

                System.out.printf("\nThe sum and average of 10 numbers is %d and %d ", sum, average);
        }
}
