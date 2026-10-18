package part07;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class LogicalOperators {
    // start of the program
    public static void main(String[] args) {
        // Creates a variable called temp and gives it a value of 25
        int temp = 25;
        // Checks if the temperature is greater than 30
        if (temp > 30) {
            //  Prints this message if temp is above 30
            System.out.println("It is warm outside!");
        } else if (temp >= 20 && temp <= 30) {
            //  Prints this message if temp is between 20 and 30
            System.out.println("It is warm outside!");
        } else { // Runs if the temperature is below 20
            // Prints this message if temp is below 20
            System.out.println("It is cold outside!");
        }

        // Allows the user to enter information
        Scanner scanner = new Scanner(System.in);

        {
            //Tells the user how to quit
            System.out.println("You are playing a game! Press q or Q to quit");
            // Stores what the user types in the response variable
            String response = scanner.next();
            //  Checks if the user typed q OR Q
            if (response.equals("q") || response.equals("Q")) {
                // Prints if the user wants to quit
                System.out.println("You quit the game");
            } else { // Runs if the user did not type q or Q
                // Prints if the user keeps playing
                System.out.println("You are still playing the game *pew pew*");
            }
            // Checks if the response is NOT q AND NOT Q
            if (!response.equals("q") && !response.equals("Q")) {
                // Prints if the user did not quit
                System.out.println("You are still playing the game *pew pew*");
            } else { // Runs if the user typed q or Q
                // Prints if the user quit
                System.out.println("You quit the game");
            }
        }
    }
}





