package part09;
import java.util.Scanner;
import java.util.Random;
// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner for user input
        Random random = new Random(); // Creates a Random object

        int secretNumber = random.nextInt(100) + 1; // Picks a random number from 1 to 100

        int guess = 0; // Stores the player's guess
        int count = 0; // Counts how many guesses the player makes

        System.out.println("I'm thinking of a number between 1 and 100."); // Prints the game instructions

        while (guess != secretNumber) { // Keeps looping until the guess is correct

            System.out.print("Your guess: "); // Asks the player for a guess

            guess = scanner.nextInt(); // Reads the number the player enters

            count++; // Adds 1 to the number of guesses

            if (guess > secretNumber) { // Checks if the guess is too high
                System.out.println("Too high!"); // Prints if the guess is too high

            } else if (guess < secretNumber) { // Checks if the guess is too low
                System.out.println("Too low!"); // Prints if the guess is too low
            }
        }

        System.out.println("Correct! You got it in " + count + " guesses."); // Prints the final message


    }
}








