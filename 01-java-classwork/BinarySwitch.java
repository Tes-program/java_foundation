import java.util.Scanner;

public class BinarySwitch {
	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter an integer 0 or 1");
		int num = inputNum.nextInt();

		if (num == 0) {
			System.out.println("Response is 1");
		}
		if (num == 1){
			System.out.println("Response is 0");
		}
		if (num > 1){
			System.out.println("Invalid input");
		}

	}
}
