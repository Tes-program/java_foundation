import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        int weight = scanner.nextInt();

        System.out.print("Enter height in inches: ");
        int height = scanner.nextInt();

        int bmi = (weight * 703) / (height * height);

        System.out.printf("%nYour BMI: %d", bmi);
        System.out.println("BMI Categories:");
        System.out.println("Underweight  : less than 18.5");
        System.out.println("Normal       : 18.5 - 24.9");
        System.out.println("Overweight   : 25.0 - 29.9");
        System.out.println("Obese        : 30.0 and above");
    }
}