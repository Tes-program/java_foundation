import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = inputCollector.nextInt();

        int aSquared = a * a;

        if (a > 100) {
            System.out.println(a + " is greater than 100");
        } 
        if (a == 100) {
            System.out.println(a + " is equal to 100");
        } 
        if ( a != 100 && a < 100) {
            System.out.println(a + " is not equal to 100");
        }
        if (a < 100) {
            System.out.println(a + " is less than 100");
}
}
}