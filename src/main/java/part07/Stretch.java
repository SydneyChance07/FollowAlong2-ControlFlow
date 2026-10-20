package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.



import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
           true
           false
           true
           false
           count is 3
           count is 2
           count is 1
           done
        */

        // Store a number.
        int x = 7;
        // Check whether x is between 5 and 10.
        System.out.println(x > 5 && x < 10);
        // Check whether x is both greater than 5 and greater than 10.
        System.out.println(x > 5 && x > 10);
        // Check whether x is less than 5 or equal to 7.
        System.out.println(x < 5 || x == 7);
        // Print the opposite of whether x equals 7.
        System.out.println(!(x == 7));

        // Start the counter at 3.
        int count = 3;
        // Count down while count is positive.
        while (count > 0) {
            System.out.println("count is " + count);
            count = count - 1;
        }
        // Print when the countdown is finished.
        System.out.println("done");

        // Start a countdown from 5.
        int countdown = 5;
        // Print each number down to 1.
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        // Announce the launch.
        System.out.println("Liftoff!");

        // Create a Scanner for password input.
        Scanner scanner = new Scanner(System.in);
        // Start with an incorrect password.
        String password = "";
        // Keep asking until the password is correct.
        while (!password.equals("java123")) {
            System.out.print("Password: ");
            password = scanner.next();
        }
        // Tell the user the password is correct.
        System.out.println("Access granted");

        // Start with a number outside the allowed range.
        int number = 0;
        // Keep asking while the number is too small or too large.
        while (number < 1 || number > 10) {
            System.out.print("Pick a number from 1 to 10: ");
            number = scanner.nextInt();
        }
        // Print the accepted number.
        System.out.println("You picked " + number);
    }
}
