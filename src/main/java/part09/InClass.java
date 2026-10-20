package part09;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps.

import java.util.Random;
import java.util.Scanner;


public class InClass {
    public static void main(String[] args) {
        // Step 1: Create a Scanner and a Random.
        // Step 2: Pick a secret number from 1 to 100.
        // Step 3: Create variables for the guess and guess count.
        // Step 4: Tell the player the number range.
        // Step 5: Ask for guesses inside a loop.
        // Step 6: Count each guess and say whether it is high or low.
        // Step 7: Stop when the guess matches the secret.
        // Step 8: Print the number of guesses.

        // Create a Random object.
        Random random = new Random();
        // Print a random number from 1 to 6.
        System.out.println("Random works: " + (random.nextInt(6) + 1));

        // Create a Scanner to read a number.
        Scanner scanner = new Scanner(System.in);
        // Ask the user for a number.
        System.out.print("Type a number: ");
        // Read the number.
        int guess = scanner.nextInt();
        // Print the number entered.
        System.out.println("You typed " + guess);

        // Start the guess counter at one.
        int count = 1;
        // Repeat three times.
        while (count <= 3) {
            // Print the current guess number.
            System.out.println("Guess number " + count);
            // Increase the counter so the loop can stop.
            count++;
        }
    }
}