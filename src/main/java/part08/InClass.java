package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        rewatch for loops (about 1:32:37) and nested loops (about 1:37:16)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.



public class InClass {
    public static void main(String[] args) {
        // Print the sensor sweep heading.
        System.out.println("=== SENSOR SWEEP ===");
        // Scan from 0 through 180 degrees in steps of 45.
        for (int angle = 0; angle <= 180; angle += 45) {
            // Print the current scanning angle.
            System.out.println("Scanning at " + angle + " degrees");
        }

        // Print the parking map heading.
        System.out.println("=== PARKING MAP ===");
        // Create three rows.
        for (int i = 1; i <= 3; i++) {
            // Print the row label.
            System.out.print("Row " + i + ": ");
            // Print five parking spaces.
            for (int j = 1; j <= 5; j++) {
                System.out.print("[ ]");
            }
            // Move to the next line.
            System.out.println();
        }
    }
}
