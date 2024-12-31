import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var bankAccount = new BankAccount("23412523", 0.0);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("Welcome to the bank system");
            System.out.println("Press 1 - To show balance");
            System.out.println("Press 2 - To deposit");
            System.out.println("Press 3 - To withdraw");
            System.out.println("Press 4 - To EXIT");

            System.out.print("Enter choice: ");
            int userChoice;
            try {
                userChoice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e ) {
                System.out.println("Invalid Input.");
                continue;
            }

            switch (userChoice) {
                case 1:
                    bankAccount.displayBalance();
                    break;
                case 2:
                    System.out.print("Enter deposite value: ");
                    double valueToDeposit = Double.parseDouble(scanner.nextLine());
                    try {
                        bankAccount.deposit(valueToDeposit);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid value input.");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdraw value: ");
                    double valueToWithdraw = Double.parseDouble(scanner.nextLine());
                    try {
                        bankAccount.withdraw(valueToWithdraw);
                    } catch (NumberFormatException e ) {
                        System.out.println("Invalid withdraw input.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }

    }
}
