package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11 (for loops) and 1:38:52 (nested loops) if you get stuck
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part08/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.


public class Challenge {
    public static String repeatWord(String word, int n) {
        // Start with an empty result.
        String result = "";
        // Add the word n times.
        for (int i = 0; i < n; i++) {
            result += word;
        }
        // Return the repeated word.
        return result;
    }

    public static String triangle(int rows) {
        // Start with an empty triangle.
        String result = "";
        // Build each row.
        for (int i = 1; i <= rows; i++) {
            // Add the correct number of stars to this row.
            for (int j = 1; j <= i; j++) {
                result += "*";
            }
            // End each row with a newline.
            result += "\n";
        }
        // Return the completed triangle.
        return result;
    }
}