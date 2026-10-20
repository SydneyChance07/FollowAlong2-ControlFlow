package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.


import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        // Create a Scanner to read user input.
        Scanner scanner = new Scanner(System.in);

        // Declare the number of rows.
        int rows;
        // Declare the number of columns.
        int columns;
        // Start with an empty symbol.
        String symbol = "";

        // Ask how many rows to print.
        System.out.println("Enter number of rows:");
        rows = scanner.nextInt();
        // Ask how many columns to print.
        System.out.println("Enter number of columns:");
        columns = scanner.nextInt();
        // Ask which symbol to use.
        System.out.println("Enter symbol to use:");
        symbol = scanner.next();

        // Repeat once for each row.
        for (int i = 1; i <= rows; i++) {
            // Start the row on a new line.
            System.out.println();
            // Repeat once for each column.
            for (int j = 1; j <= columns; j++) {
                // Print the symbol without starting a new line.
                System.out.print(symbol);
            }
        }
    }
}
