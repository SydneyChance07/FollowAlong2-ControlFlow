package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.



import java.util.Random;
import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
           32 5
           7 is odd
           4 is even
           1 is odd
        */

        // Start the count at zero.
        int count = 0;
        // Start n at one.
        int n = 1;
        // Double n while it is less than 20.
        while (n < 20) {
            n = n * 2;
            count++;
        }
        // Print the final value and count.
        System.out.println(n + " " + count);

        // Start x at seven.
        int x = 7;
        // Repeat while x is positive.
        while (x > 0) {
            // Check whether x is even.
            if (x % 2 == 0) {
                System.out.println(x + " is even");
                // Handle odd numbers.
            } else {
                System.out.println(x + " is odd");
            }
            // Subtract three from x.
            x -= 3;
        }

        // Start the sum at zero.
        int sum = 0;
        // Start counting at one.
        int i = 1;
        // Add the numbers from 1 through 10.
        while (i <= 10) {
            sum += i;
            i++;
        }
        // Print the total.
        System.out.println("Sum: " + sum);

        // Create a Scanner for user input.
        Scanner scanner = new Scanner(System.in);
        // Start with an invalid number.
        int pick = 0;
        // Keep asking while the number is outside 1 through 10.
        while (pick < 1 || pick > 10) {
            System.out.print("Pick a number from 1 to 10: ");
            pick = scanner.nextInt();
        }
        // Thank the user for choosing a valid number.
        System.out.println("Thanks! You picked " + pick + ".");

        // Create a Random object for rolling dice.
        Random random = new Random();
        // Start the number of rolls at zero.
        int rolls = 0;
        // Start with a roll that is not six.
        int roll = 0;
        // Keep rolling until a six appears.
        while (roll != 6) {
            roll = random.nextInt(6) + 1;
            rolls++;
            System.out.println("Rolled a " + roll);
        }
        // Print how many rolls it took.
        System.out.println("It took " + rolls + " rolls to get a 6.");
    }
}
