import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    boolean playAgain = true;

    while (playAgain) {
      // Generate a random number between 1 and 100
      int numberToGuess = random.nextInt(100) + 1;
      int numberOfTries = 0;
      boolean hasGuessedCorrectly = false;

      System.out.println("Welcome to Guess the Number!");
      System.out.println("I have selected a number between 1 and 100. Try to guess it!");

      while (!hasGuessedCorrectly) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        numberOfTries++;

        if (userGuess < numberToGuess) {
          System.out.println("Too low! Try again.");
        } else if (userGuess > numberToGuess) {
          System.out.println("Too high! Try again.");
        } else {
          hasGuessedCorrectly = true;
          System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
        }
      }

      // Ask the user if they want to play again
      System.out.print("Do you want to play again? (yes/no): ");
      String response = scanner.next();
      if (!response.equalsIgnoreCase("yes")) {
        playAgain = false;
        System.out.println("Thank you for playing! Goodbye.");
      }
    }

    scanner.close();
  }
}
