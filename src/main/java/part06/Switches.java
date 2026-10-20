package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.



public class Switches {
    public static void main(String[] args) {
        // Store the day to check.
        String day = "Pizza";
        // Compare the day with each case.
        switch (day) {
            // Check whether the day is Sunday.
            case "Sunday":
                // Print the Sunday message.
                System.out.println("It is Sunday");
                // Exit the switch.
                break;
            // Check whether the day is Monday.
            case "Monday":
                // Print the Monday message.
                System.out.println("It is Monday");
                // Exit the switch.
                break;
            // Check whether the day is Tuesday.
            case "Tuesday":
                // Print the Tuesday message.
                System.out.println("It is Tuesday");
                // Exit the switch.
                break;
            // Check whether the day is Wednesday.
            case "Wednesday":
                // Print the Wednesday message.
                System.out.println("It is Wednesday");
                // Exit the switch.
                break;
            // Check whether the day is Thursday.
            case "Thursday":
                // Print the Thursday message.
                System.out.println("It is Thursday");
                // Exit the switch.
                break;
            // Check whether the day is Friday.
            case "Friday":
                // Print the Friday message.
                System.out.println("It is Friday");
                // Exit the switch.
                break;
            // Check whether the day is Saturday.
            case "Saturday":
                // Print the Saturday message.
                System.out.println("It is Saturday");
                // Exit the switch.
                break;
            // Handle anything that is not a day.
            default:
                // Print the invalid day.
                System.out.println(day + " is not a day");
        }
    }
}
