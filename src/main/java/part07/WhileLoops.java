package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.


import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // Create a Scanner for user input.
        Scanner scanner = new Scanner(System.in);
        // Start with an empty name.
        String name = "";
        // Keep asking while the name is blank.
        do {
            // Ask the user for their name.
            System.out.print("Enter your name: ");
            // Read the name.
            name = scanner.nextLine();
            // Repeat if the name is blank.
        } while (name.isBlank());
        // Greet the user.
        System.out.println("Hello " + name);
    }
}
