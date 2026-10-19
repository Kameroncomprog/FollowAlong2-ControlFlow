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

    // The price of a movie ticket, in dollars.
    //   Younger than 5          -> 0  (free)
    //   65 or older             -> 5
    //   a student (any other age) -> 7
    //   everyone else           -> 10
    // ticketPrice(3, false)  should return 0
    // ticketPrice(70, true)  should return 5   (age rules come first)
    // ticketPrice(19, true)  should return 7
    // ticketPrice(30, false) should return 10
    public static int ticketPrice(int age, boolean student) {
        if (age < 5) { // Checks if the person is younger than 5
            return 0; // Ticket is free

        } else if (age >= 65) { // Checks if the person is 65 or older
            return 5; // Ticket costs $5

        } else if (student == true) { // Checks if the person is a student
            return 7; // Ticket costs $7

        } else { // Runs if none of the conditions are true
            return 10; // Regular ticket costs $10
        }
    }

        // The letter grade for a score.
        //   90 or more -> "A"    80 or more -> "B"    70 or more -> "C"
        //   60 or more -> "D"    anything lower -> "F"
        // letterGrade(95) should return "A"
        // letterGrade(80) should return "B"
        // letterGrade(59) should return "F"
        public static String letterGrade ( int score) {
            if (score >= 90) { // Checks if score is 90 or higher
                return "A"; // Returns A

            } else if (score >= 80) { // Checks if score is 80 or higher
                return "B"; // Returns B

            } else if (score >= 70) { // Checks if score is 70 or higher
                return "C"; // Returns C

            } else if (score >= 60) { // Checks if score is 60 or higher
                return "D"; // Returns D

            } else { // Runs if score is below 60
                return "F";
            }
        }
    }


