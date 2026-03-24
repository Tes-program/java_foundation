package Day4.Assignment;

public class Problem {

    private String name;
    private String description;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        this.isSolved = false;
        this.description = "No description provided";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProblemType getType() {
        return type;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }
}
