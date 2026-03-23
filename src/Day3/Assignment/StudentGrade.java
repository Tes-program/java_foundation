package Day3.Assignment;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        System.out.print("How many subjects do they offer? ");
        int numberOfSubjects = Integer.parseInt(scanner.nextLine());

        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        String[] studentNames = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            studentNames[i] = "Student " + (i + 1);
        }

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.println("Entering score for student " + (i + 1));
                System.out.print("Enter score for subject " + (j + 1) + ": ");
                int score = Integer.parseInt(scanner.nextLine());

                while (score < 0 || score > 100) {
                    System.out.println("Score must be between 0 and 100. Try again.");
                    System.out.print("Enter score for subject " + (j + 1) + ": ");
                    score = Integer.parseInt(scanner.nextLine());
                }

                scores[i][j] = score;
            }
            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully");
        }

        int[] totals = new int[numberOfStudents];
        double[] averages = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                total = total + scores[i][j];
            }
            totals[i] = total;
            averages[i] = (double) total / numberOfSubjects;
        }

        int[] positions = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            int position = 1;
            for (int j = 0; j < numberOfStudents; j++) {
                if (totals[j] > totals[i]) {
                    position = position + 1;
                }
            }
            positions[i] = position;
        }

        System.out.println("====================================================================================================");
        System.out.printf("%-12s", "STUDENT");
        for (int j = 0; j < numberOfSubjects; j++) {
            System.out.printf("%-8s", "SUB" + (j + 1));
        }
        System.out.printf("%-8s%-8s%-8s%n", "TOT", "AVE", "POS");
        System.out.println("==================================================================================================");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-12s", studentNames[i]);
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.printf("%-8d", scores[i][j]);
            }
            System.out.printf("%-8d%-8.2f%-8d%n", totals[i], averages[i], positions[i]);
        }

        System.out.println("===================================================================================================");
        System.out.println("====================================================================================================");

        System.out.println();
        System.out.println("SUBJECT SUMMARY");

        int hardestSubject = 0;
        int mostFails = 0;
        int easiestSubject = 0;
        int mostPasses = 0;

        for (int j = 0; j < numberOfSubjects; j++) {
            int highestScore = scores[0][j];
            int highestStudent = 0;
            int lowestScore = scores[0][j];
            int lowestStudent = 0;
            int subjectTotal = 0;
            int passes = 0;
            int fails = 0;

            for (int i = 0; i < numberOfStudents; i++) {
                if (scores[i][j] > highestScore) {
                    highestScore = scores[i][j];
                    highestStudent = i;
                }
                if (scores[i][j] < lowestScore) {
                    lowestScore = scores[i][j];
                    lowestStudent = i;
                }
                subjectTotal = subjectTotal + scores[i][j];
                if (scores[i][j] >= 50) {
                    passes = passes + 1;
                } else {
                    fails = fails + 1;
                }
            }

            if (fails > mostFails) {
                mostFails = fails;
                hardestSubject = j;
            }
            if (passes > mostPasses) {
                mostPasses = passes;
                easiestSubject = j;
            }

            double subjectAverage = (double) subjectTotal / numberOfStudents;

            System.out.println("Subject " + (j + 1));
            System.out.println("Highest scoring student is:  " + studentNames[highestStudent] + " scoring " + highestScore);
            System.out.println("Lowest Scoring student is: " + studentNames[lowestStudent] + " scoring " + lowestScore);
            System.out.println("Total Score is:  " + subjectTotal);
            System.out.printf("Average score is: %.2f%n", subjectAverage);
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of Fails: " + fails);
            System.out.println();
        }

        int overallHighest = scores[0][0];
        int overallHighestStudent = 0;
        int overallHighestSubject = 0;
        int overallLowest = scores[0][0];
        int overallLowestStudent = 0;
        int overallLowestSubject = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjects; j++) {
                if (scores[i][j] > overallHighest) {
                    overallHighest = scores[i][j];
                    overallHighestStudent = i;
                    overallHighestSubject = j;
                }
                if (scores[i][j] < overallLowest) {
                    overallLowest = scores[i][j];
                    overallLowestStudent = i;
                    overallLowestSubject = j;
                }
            }
        }

        System.out.println("The hardest subject is Subject " + (hardestSubject + 1) + " with " + mostFails + " failures");
        System.out.println("The easiest subject is Subject " + (easiestSubject + 1) + " with " + mostPasses + " passes");
        System.out.println("The overall Highest score is scored by " + studentNames[overallHighestStudent] + " in subject " + (overallHighestSubject + 1) + " scoring " + overallHighest);
        System.out.println("The overall Lowest score is scored by " + studentNames[overallLowestStudent] + " in subject " + (overallLowestSubject + 1) + " scoring " + overallLowest);
        System.out.println("=========================================================================================");

        int bestStudent = 0;
        int worstStudent = 0;
        int classTotal = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            classTotal = classTotal + totals[i];
            if (totals[i] > totals[bestStudent]) {
                bestStudent = i;
            }
            if (totals[i] < totals[worstStudent]) {
                worstStudent = i;
            }
        }

        double classAverage = (double) classTotal / numberOfStudents;

        System.out.println("CLASS SUMMARY");
        System.out.println("=============================================================================================");
        System.out.println("Best Graduating Student is: " + studentNames[bestStudent] + " scoring " + totals[bestStudent]);
        System.out.println("==============================================================================================");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst Graduating Student is: " + studentNames[worstStudent] + " scoring " + totals[worstStudent]);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("===============================================================================================");
        System.out.println("Class total score is: " + classTotal);
        System.out.printf("Class Average score is: %.1f%n", classAverage);
        System.out.println("=================================================================================================");

        scanner.close();
    }
}