package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.


import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Store the temperature.
        int temp = 25;
        // Check whether the temperature is hot.
        if (temp > 30) {
            System.out.println("It is hot outside!");
            // Check whether the temperature is between 20 and 30.
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
            // Handle temperatures below 20.
        } else {
            System.out.println("It is cold outside!");
        }

        // Create a Scanner to read the user's response.
        Scanner scanner = new Scanner(System.in);
        // Tell the user how to quit.
        System.out.println("You are playing a game! Press q or Q to quit");
        // Read the response.
        String response = scanner.next();
        // Check whether the response is neither q nor Q.
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
            // Handle a quit response.
        } else {
            System.out.println("You quit the game");
        }
    }
}
