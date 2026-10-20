package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        rewatch 80:43–91:54 for logical operators and while loops
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.


public class InClass {
    public static void main(String[] args) {
        // Check whether each rover can drive.
        System.out.println("Can drive? " + canDrive(80, false));
        System.out.println("Can drive? " + canDrive(80, true));
        System.out.println("Can drive? " + canDrive(10, false));

        // Start with a full battery.
        int battery = 100;
        // Keep driving while the battery is at least 20.
        while (battery >= 20) {
            // Print the current battery level.
            System.out.println("Driving... battery " + battery + "%");
            // Use 25 percent of the battery.
            battery -= 25;
        }
        // Print the battery level where the rover stopped.
        System.out.println("Stopped at " + battery + "%");

        // Check whether the battery is between 20 and 100.
        boolean inRange = battery > 20 && battery < 100;
        // Check whether the battery is over 20 or under 100.
        boolean almostFull = battery > 20 || battery < 100;
        // Check whether the battery is positive.
        boolean ready = battery > 0 && true;
    }

    // Decide whether the rover can drive.
    static boolean canDrive(int battery, boolean docked) {
        // The rover needs enough battery and must not be docked.
        return battery > 20 && !docked;
    }
}
