package part09;

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



import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a Scanner to read the player's guesses.
        Scanner scanner = new Scanner(System.in);
        // Create a Random to pick the secret number.
        Random random = new Random();

        // Pick a secret number from 1 to 100.
        int secret = random.nextInt(100) + 1;
        // Start the guess at zero.
        int guess = 0;
        // Start the guess counter at zero.
        int count = 0;

        // Tell the player the number range.
        System.out.println("I'm thinking of a number between 1 and 100.");

        // Keep playing until the guess matches the secret.
        while (guess != secret) {
            // Ask the player to enter a guess on the same line.
            System.out.print("Your guess: ");
            // Read the player's guess.
            guess = scanner.nextInt();
            // Count this guess.
            count++;

            // Check whether the guess is too high.
            if (guess > secret) {
                System.out.println("Too high!");
                // Check whether the guess is too low.
            } else if (guess < secret) {
                System.out.println("Too low!");
            }
        }

        // Tell the player they won and show the number of guesses.
        System.out.println("Correct! You got it in " + count + " guesses.");
    }
}
