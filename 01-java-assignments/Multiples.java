import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = inputCollector.nextInt();

        System.out.print("Enter second integer: ");
        int b = inputCollector.nextInt();

        if ((a * 3) % (b * 2) == 0)
            System.out.println(a + " tripled is a multiple of " + b + " doubled");
        else
            System.out.println(a + " tripled is not a multiple of " + b + " doubled");
    }
}
