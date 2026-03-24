package Day4.Assignment;

public class Person {

    private String name;
    private Problem[] problems;
    private int totalProblems;

    public Person(String name) {
        this.name = name;
        this.problems = new Problem[100];
        this.totalProblems = 0;
    }

    public String getName() {
        return name;
    }

    public void addProblem(Problem problem) {
        problems[totalProblems] = problem;
        totalProblems = totalProblems + 1;
        System.out.println("\"" + problem.getName() + "\" has been added to your problems.");
    }

    public void solveProblem(String name) {
        for (int i = 0; i < totalProblems; i++) {
            if (problems[i].getName().equalsIgnoreCase(name)) {
                if (problems[i].isSolved()) {
                    System.out.println("\"" + name + "\" is already solved!");
                } else {
                    problems[i].setSolved(true);
                    System.out.println("\"" + name + "\" has been marked as solved. Well done!");
                }
                return;
            }
        }
        System.out.println("Problem \"" + name + "\" was not found.");
    }

    public void recountUnsolved() {
        int unsolvedCount = 0;

        for (int i = 0; i < totalProblems; i++) {
            if (!problems[i].isSolved()) {
                unsolvedCount = unsolvedCount + 1;
            }
        }

        if (unsolvedCount == 0) {
            System.out.println("Great news! You have no unsolved problems.");
            return;
        }

        System.out.println("\nYou have " + unsolvedCount + " unsolved problem(s):");
        System.out.println("------------------------------------------");
        System.out.printf("%-5s %-20s %-15s %-10s%n", "No.", "Name", "Type", "Status");
        System.out.println("------------------------------------------");

        int count = 1;
        for (int i = 0; i < totalProblems; i++) {
            if (!problems[i].isSolved()) {
                System.out.printf("%-5d %-20s %-15s %-10s%n",
                        count,
                        problems[i].getName(),
                        problems[i].getType(),
                        "Unsolved");
                count = count + 1;
            }
        }
        System.out.println("------------------------------------------");
    }
}
