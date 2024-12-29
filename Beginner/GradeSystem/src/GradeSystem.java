import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class GradeSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the student grades (comma-seperated): ");
                String userInput = scanner.nextLine();

                if(userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                if(userInput.trim().isEmpty()) {
                    System.out.println("Input cannot be empty. Try again.");
                    continue;
                }

                int[] grades;
                try {
                     grades = Arrays.stream(userInput.split("[\\s,]")).mapToInt(Integer::parseInt).toArray();
                } catch (NumberFormatException e) {
                    System.err.println("Invalid input. Please enter comma-seperated integers");
                    continue;
                }

                OptionalDouble average = Arrays.stream(grades).average();
                double averageValue = average.orElse(0.0);
                int averageGrade = (int) averageValue;

                System.out.println("Average: " + averageValue);

                OptionalInt minGrade = Arrays.stream(grades).min();
                OptionalInt maxGrade = Arrays.stream(grades).max();

                minGrade.ifPresent(min -> System.out.println("Lowest grade: " + min));
                maxGrade.ifPresent(max -> System.out.println("Highest grade: " + max));


                String grade;

                if ( averageGrade >= 95) {
                    grade = "A+";
                } else if ( averageGrade >= 90) {
                    grade = "A";
                } else if ( averageGrade >= 88) {
                    grade = "B+";
                } else if ( averageGrade >= 85) {
                    grade = "B";
                } else if ( averageGrade >= 80) {
                    grade = "C+";
                } else if ( averageGrade >= 75) {
                    grade = "C";
                } else if ( averageGrade >= 70) {
                    grade = "C-";
                } else {
                    grade = "Failed";
                }

                System.out.println("Grade: " + grade);

            }catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            }

        }

        scanner.close();


    }
}
