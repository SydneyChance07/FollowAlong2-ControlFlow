package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminder: if / else if / else — part 06 (video: https://www.youtube.com/watch?v=xk4_1vDrzzo)
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part09/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.



public class Challenge {
    public static int ticketPrice(int age, boolean student) {
        // Children younger than five get in free.
        if (age < 5) {
            return 0;
            // People aged 65 or older pay five dollars.
        } else if (age >= 65) {
            return 5;
            // Students pay seven dollars.
        } else if (student) {
            return 7;
            // Everyone else pays ten dollars.
        } else {
            return 10;
        }
    }

    public static String letterGrade(int score) {
        // Check for an A.
        if (score >= 90) {
            return "A";
            // Check for a B.
        } else if (score >= 80) {
            return "B";
            // Check for a C.
        } else if (score >= 70) {
            return "C";
            // Check for a D.
        } else if (score >= 60) {
            return "D";
            // Give an F to any lower score.
        } else {
            return "F";
        }
    }
}
