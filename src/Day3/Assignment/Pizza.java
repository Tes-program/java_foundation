package Day3.Assignment;

import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        int slices = 0;
        int pricePerBox = 0;

        Scanner pizza_type = new Scanner(System.in);
        Scanner number_of_people = new Scanner(System.in);

        System.out.println("""
                Enter the pizza type:
                1. Sapa Size - 4 slices
                2. Small Money - 6 slices
                3. Big Boys - 8 slices
                4. Odogwu - 12 slices
                """);
        int pizza_type_input = pizza_type.nextInt();
        System.out.println("Enter the number of people: ");
        int number_of_people_input = number_of_people.nextInt();

        switch (pizza_type_input) {
            case 1 -> {
                slices = 4;
                pricePerBox = 2500;
            }
            case 2 -> {
                slices = 6;
                pricePerBox = 2900;
            }
            case 3 -> {
                slices = 8;
                pricePerBox = 4000;
            }
            case 4 -> {
                slices = 12;
                pricePerBox = 5200;
            }
            default -> System.out.println("Invalid input");
        }

        int numberOfBoxes = (number_of_people_input + slices - 1) / slices;

        int totalSlices = numberOfBoxes * slices;

        int leftoverSlices = totalSlices - number_of_people_input;

        int totalPrice =  numberOfBoxes * pricePerBox;

        System.out.println("Total number of slices: " + totalSlices);
        System.out.println("Total number of boxes: " + numberOfBoxes);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Leftover slices: " + leftoverSlices);
    }
}
