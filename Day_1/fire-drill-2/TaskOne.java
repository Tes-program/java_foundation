import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args) {
		int sum = 0;
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter 10 scores: ");


		for (int i = 0; i < 10; i++) {
			System.out.print("Score " + (i + 1) + " : ");

			int num = inputNum.nextInt();

			sum =  sum + num;
		}

		System.out.println("The sum of the 10 scores is: " + sum);
	}
}
