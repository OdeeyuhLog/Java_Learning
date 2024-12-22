import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number 1-100");
        while(true) {
            System.out.print("Enter a number: ");
            int numberInput = scanner.nextInt();

            if(numberInput < numberToGuess) {
                System.out.println("Higher");
            } else if (numberInput > numberToGuess) {
                System.out.println("Lower");
            } else {
                System.out.println("You guessed the number!");
                break;
            }
        }
    }
}
