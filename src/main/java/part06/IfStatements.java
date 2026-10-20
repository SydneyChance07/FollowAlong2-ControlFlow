package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.


public class IfStatements {
    public static void main(String[] args) {
        // Store the age.
        int age = 75;
        // Check whether the age is exactly 75.
        if (age == 75) {
            // Print this message if the age is 75.
            System.out.println("OK boomer!");
            // Check whether the age is at least 18.
        } else if (age >= 18) {
            // Print this message if the person is an adult.
            System.out.println("You are an adult!");
            // Check whether the age is at least 13.
        } else if (age >= 13) {
            // Print this message if the person is a teenager.
            System.out.println("You are a teenager!");
            // Handle ages that did not match the earlier conditions.
        } else {
            // Print this message for anyone who is not an adult.
            System.out.println("You are not an adult!");
        }
    }
}
