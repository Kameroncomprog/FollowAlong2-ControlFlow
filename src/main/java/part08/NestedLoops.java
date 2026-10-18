package part08;
import java.util.Scanner;
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

public class NestedLoops {
    // start of the program
    public static void main(String[] args) {
        // Allows the user to type information
        Scanner scanner = new Scanner(System.in);
        // Creates a variable to store the number of rows
        int rows;
        //  Creates a variable to store the number of columns
        int columns;
        // Creates an empty String to store the symbol
        String symbol = "";
        // Asks the user how many rows they want
        System.out.println("Enter number of rows:");
        //  Stores the number of rows the user enters
        rows = scanner.nextInt();
        // Asks the user how many columns they want
        System.out.println("Enter number of columns:");
        //  Stores the number of columns the user enters
        columns = scanner.nextInt();
        // Asks the user what symbol they want
        System.out.println("Enter symbol to use:");
        // Stores the symbol the user types
        symbol = scanner.next();
        // Outer loop controls how many rows are created
        for (int i = 1; i <= rows; i++) {
            // Moves to a new line for each row
            System.out.println();
            // Inner loop controls how many symbols appear in each row
            for (int j = 1; j <= columns; j++) {
                // Prints the symbol without moving to a new line
                System.out.print(symbol);
            }
        }
    }

}
