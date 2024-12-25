import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("File System Explorer");
            System.out.println("--------------------");
            System.out.println(" 1 - Create text file");
            System.out.println(" 2 - Read text file");
            System.out.println(" 3 - Delete existing text file");
            System.out.println(" 4 - Quit");
            System.out.print("Enter a valid number choice: ");

            try {
                int menuChoice = Integer.parseInt(scanner.nextLine());

                switch (menuChoice) {
                    case 1:
                        System.out.print("Enter the name of the file: ");
                        String newFileName = scanner.nextLine();
                        Path filePath = Paths.get(newFileName + ".txt");

                        if (Files.exists(filePath)) {
                            System.out.print("File already exists. Overwrite? (yes/no)");
                            String overwrite = scanner.nextLine().trim().toLowerCase();
                            if (!overwrite.equals("yes")) {
                                System.out.println("File creation canceled");
                                break;
                            }
                        }
                        System.out.print("Enter the initial content of the file: ");
                        String newFileInitialContent = scanner.nextLine();

                        try {
                            Files.writeString(filePath, newFileInitialContent);
                            System.out.println("File created written at: " + filePath.toAbsolutePath());
                        } catch (Exception e) {
                            System.out.println("Error in creating a file: " + e.getMessage());
                        }

                        continue;
                    case 2:
                        System.out.print("Enter the name of the file to read: ");
                        String fileNameToRead = scanner.nextLine();
                        Path filePathForRead = Paths.get(fileNameToRead + ".txt");

                        try {
                            List<String> lines = Files.readAllLines(filePathForRead);
                            lines.forEach(System.out::println);
                        } catch (Exception e) {
                            System.err.println("Error reading file: " + e.getMessage());
                        }

                        continue;
                    case 3:
                        System.out.print("Enter the name of the file to delete: ");
                        String fileNameToDelete = scanner.nextLine();
                        Path filePathToDelete = Paths.get(fileNameToDelete + ".txt");

                        try {
                            if (Files.exists(filePathToDelete)) {
                                Files.delete(filePathToDelete);
                                System.out.println("File deleted successfully. " + filePathToDelete.toAbsolutePath());
                            } else {
                                System.out.println("File not found." + filePathToDelete.toAbsolutePath());
                            }
                        } catch (Exception e) {
                            System.err.println("Error deleting files: " + e.getMessage());
                        }
                        continue;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please select a valid menu option");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a number");
            }


        }
    }
}
