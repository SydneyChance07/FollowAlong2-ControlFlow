package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        rewatch 68:48–80:18 for if statements and switches
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.



public class InClass {
    public static void main(String[] args) {
        // Print the battery status for three battery levels.
        System.out.println(batteryStatus(100));
        System.out.println(batteryStatus(60));
        System.out.println(batteryStatus(15));

        // Store the current driving mode.
        String mode = "CRUISE";

        // Choose what to print based on the mode.
        switch (mode) {
            // Handle normal driving.
            case "CRUISE":
                System.out.println("Driving forward");
                break;
            // Handle turning.
            case "TURN":
                System.out.println("Turning");
                break;
            // Handle any other mode.
            default:
                System.out.println("Stopped");
        }

        // Store a battery level for the corrected examples.
        int battery = 50;

        // Check whether the battery is between 20 and 100.
        boolean inRange = battery > 20 && battery < 100;
        // Check whether the battery is over 20 or under 100.
        boolean almostFull = battery > 20 || battery < 100;
        // Check whether the battery is ready.
        boolean ready = battery > 0 && true;

        // Print the results of the three checks.
        System.out.println(inRange);
        System.out.println(almostFull);
        System.out.println(ready);
    }

    // Return a word describing the battery level.
    static String batteryStatus(int battery) {
        // Check whether the battery is full.
        if (battery >= 100) {
            return "full";
            // Check whether the battery is at least 20.
        } else if (battery >= 20) {
            return "ok";
            // Handle a battery below 20.
        } else {
            return "low";
        }
    }
}