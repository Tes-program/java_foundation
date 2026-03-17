import java.util.Scanner;

public class TaskSeven {
        public static void main(String[] args) {
                int sum = 0;
                int j = 0;
                Scanner inputNum = new Scanner(System.in);
                System.out.println("Enter 10 scores: ");


                for (int i = 0; i < 10; i++) {
                        System.out.print("Score " + (i + 1) + " : ");

                        int num = inputNum.nextInt();

                        if (num % 2 == 0) {
                                sum = num + sum;
                                j++;
                        }
                }

                int average = sum / j;

                System.out.printf("\nThe sum and average of the even number is: %d, %d \n", average, sum);
        }
}
