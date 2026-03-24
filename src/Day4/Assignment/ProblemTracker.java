package Day4.Assignment;

import java.util.Scanner;

public class ProblemTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String personName = scanner.nextLine();

        Person person = new Person(personName);

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===========================");
            System.out.println("  Hello, " + person.getName());
            System.out.println("===========================");
            System.out.println("1. Add a problem");
            System.out.println("2. Solve a problem");
            System.out.println("3. See my unsolved problems");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the problem name: ");
                    String name = scanner.nextLine();

                    System.out.println("Select the problem type:");
                    System.out.println("1. FINANCIAL");
                    System.out.println("2. SPIRITUAL");
                    System.out.println("3. EDUCATION");
                    System.out.println("4. BUSINESS");
                    System.out.println("5. TECHNICAL");
                    System.out.print("Enter your choice: ");
                    int typeChoice = Integer.parseInt(scanner.nextLine());

                    ProblemType type;
                    switch (typeChoice) {
                        case 1:  type = ProblemType.FINANCIAL;  break;
                        case 2:  type = ProblemType.SPIRITUAL;  break;
                        case 3:  type = ProblemType.EDUCATION;  break;
                        case 4:  type = ProblemType.BUSINESS;   break;
                        case 5:  type = ProblemType.TECHNICAL;  break;
                        default: type = ProblemType.FINANCIAL;  break;
                    }

                    Problem problem = new Problem(name, type);
                    person.addProblem(problem);
                    System.out.println("Problem added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the name of the problem you solved: ");
                    String solvedName = scanner.nextLine();
                    person.solveProblem(solvedName);
                    break;

                case 3:
                    person.recountUnsolved();
                    break;

                case 4:
                    System.out.println("Goodbye, " + person.getName() + "!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
