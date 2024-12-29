import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Enter the array of integers: ");
                String userInput = scanner.nextLine();

                if(userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                if(userInput.trim().isEmpty()) {
                    System.out.println("Input cannot be empty. Please try again.");
                    continue;
                }

                int[] integers;
                try {
                    integers = Arrays.stream(userInput.split("[\\s,]")).mapToInt(Integer::parseInt).toArray();
                } catch (NumberFormatException e) {
                    System.err.println("Invalid input. Please enter comma-seperated integers");
                    continue;
                }

                Set<Integer> seen = new HashSet<>();
                Set<Integer> duplicates = new HashSet<>();

                for (int num : integers) {
                    if(!seen.add(num)) {
                        duplicates.add(num);
                    }
                }

                System.out.println("Duplicates: " + duplicates);

            } catch (Exception e) {
                System.err.println("Error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
