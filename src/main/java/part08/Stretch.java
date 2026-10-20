package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11–1:36:00 for the three parts of a for loop
// Guide: GUIDE.md in this folder, steps 2–5 and 8
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.



public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
           1 2 3
           i is 5
           i is 3
           i is 1
           ***
           ***
        */

        // Print the numbers 1 through 3 on one line.
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        // Move to the next line.
        System.out.println();

        // Count down from 5 by 2.
        for (int i = 5; i > 0; i -= 2) {
            System.out.println("i is " + i);
        }

        // Make two rows of stars.
        for (int i = 1; i <= 2; i++) {
            // Print three stars in each row.
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            // Move to the next row.
            System.out.println();
        }

        // Count down from 5 to 1.
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        // Print the launch message.
        System.out.println("Liftoff!");

        // Print even numbers from 2 to 20.
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        // Move to the next line.
        System.out.println();

        // Create five rows for the times table.
        for (int row = 1; row <= 5; row++) {
            // Create five columns in each row.
            for (int col = 1; col <= 5; col++) {
                // Print the product followed by a tab.
                System.out.print(row * col + "\t");
            }
            // Start the next row.
            System.out.println();
        }
    }
}