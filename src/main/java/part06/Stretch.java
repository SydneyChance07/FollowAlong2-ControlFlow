package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        rewatch 69:21–74:54 for if / else if / else, 76:36–80:18 for switch
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.



import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
           C or better
           Medium
           Hard
        */

        // Store the score.
        int score = 85;
        // Check the score from highest priority condition to lowest.
        if (score >= 70) {
            System.out.println("C or better");
        } else if (score >= 80) {
            System.out.println("B or better");
        } else {
            System.out.println("Below C");
        }

        // Store the game level.
        int level = 2;
        // Choose messages based on the level.
        switch (level) {
            case 1:
                System.out.println("Easy");
            case 2:
                System.out.println("Medium");
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Unknown");
        }

        // Store the temperature.
        int temperature = 72;
        // Choose weather clothing based on temperature.
        if (temperature >= 80) {
            System.out.println("Shorts weather");
        } else if (temperature >= 60) {
            System.out.println("Hoodie weather");
        } else {
            System.out.println("Coat weather");
        }

        // Store a month number.
        int month = 4;
        // Choose a season based on the month.
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("That is not a month");
        }

        // Create a Scanner to read the battery percentage.
        Scanner scanner = new Scanner(System.in);
        // Ask the user for the battery percentage.
        System.out.print("Battery percent: ");
        int battery = scanner.nextInt();
        // Print a message based on the battery percentage.
        if (battery < 20) {
            System.out.println("Low battery. Go charge!");
        } else if (battery < 80) {
            System.out.println("Battery OK");
        } else {
            System.out.println("Fully charged");
        }
    }
}
