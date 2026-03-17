import java.util.Scanner;

public class Parity {
   public static void main(String[] args) {
	
	Scanner inputCollector = new Scanner(System.in);
	System.out.println("Enter a number");
	int inputNumber = inputCollector.nextInt();


	if (inputNumber % 2 == 0) {
		System.out.printf(inputNumber + " is even");
	} 
	if (inputNumber % 2 != 0) {
		System.out.printf(inputNumber + " is odd");
	}

}

}
