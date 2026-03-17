import java.util.Scanner;

public class IVR {
	public static void main(String... args) {
		Scanner inputCollector = new Scanner(System.in);

		String prompt = """
			Welcome to MTN self service.
			To Listen
			Press 1 -> English
			Press 2 -> Yoruba
			Press 3 -> Hausa
			""";

		System.out.println(prompt);
		int userInput = inputCollector.nextInt();
		switch (userInput) {
			case 2: System.out.println("Yoruba"); break;
			case 3: System.out.println("Hausa"); break;
			case 1: System.out.println("English"); break;
			default: System.out.println("Invalid input, press the options displayed above");
		}
	}
}
