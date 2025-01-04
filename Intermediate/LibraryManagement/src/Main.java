import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Welcome to the Library Application!");
      System.out.println("-----------------------------------");
      System.out.println("1 - Add Book");
      System.out.println("2 - Add Member");
      System.out.println("3 - Borrow Book");
      System.out.println("4 - Return Book");
      System.out.println("5 - Display All Books");
      System.out.println("6 - Display All Members");
      System.out.println("7 - Display All Transactions");
      System.out.println("8 - Exit");
      System.out.print("Choose an option: ");

      int userChoice = 0;
      try {
        userChoice = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Please enter a number. Try again.");
      }

      switch (userChoice) {
        case 1:
          System.out.print("Name of the book: ");
          String bookTitle = scanner.nextLine();
          System.out.print("Author of the book: ");
          String bookAuthor = scanner.nextLine();
          library.addBook(bookTitle, bookAuthor);
          break;

        case 2:
          System.out.print("Enter name: ");
          String memberName = scanner.nextLine();
          library.addMember(memberName);
          break;

        case 3:
          System.out.print("Name of the book to borrow: ");
          String bookToBorrow = scanner.nextLine();
          System.out.print("Your name: ");
          String borrowerName = scanner.nextLine();
          library.borrowBook(bookToBorrow, borrowerName);
          break;

        case 4:
          System.out.print("Name of the book to return: ");
          String bookToReturn = scanner.nextLine();
          System.out.print("Your name: ");
          String returnerName = scanner.nextLine();
          library.returnBook(bookToReturn, returnerName);
          break;

        case 5:
          library.displayAllBooks();
          break;

        case 6:
          library.displayAllMembers();
          break;

        case 7:
          library.displayAllTransaction();
          break;

        case 8:
          System.out.println("Exiting the library application. Goodbye!");
          scanner.close();
          System.exit(0);
          break;

        default:
          System.out.println("You entered an invalid choice. Try again.");
          break;
      }
    }
  }
}
