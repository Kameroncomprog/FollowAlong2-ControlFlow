package part09;
import java.util.Scanner;
import java.util.Random;

// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        while (n < 20) {
            n = n * 2;
            count++;
            // 32  is 5
        }
        System.out.println(n + " " + count);

        int x = 7; // 7 is odd
        while (x > 0) {
            if (x % 2 == 0) { // 4 is even
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
            x -= 3; // 1 is odd
        }

        //B1.
        int sum = 0; // Starts the total at 0
        int i = 1; // Starts counting at 1

        while (i <= 10) { // Keeps looping until i is greater than 10
            sum += i; // Adds i to the total
            i++; // Adds 1 to i each time
        }
        System.out.println("Sum: " + sum); // Prints the total

        //B2.
        Scanner scanner = new Scanner(System.in); // Allows the user to type a number

        int pick = 0; // Starts the number at 0

        while (pick < 1 || pick > 10) { // Repeats if the number is below 1 OR above 10

            System.out.print("Pick a number from 1 to 10: "); // Asks the user to pick a number

            pick = scanner.nextInt(); // Stores the number the user enters
        }

        System.out.println("Thanks! You picked " + pick + "."); // Prints the valid number

        //B2.
        Scanner scanner1 = new Scanner(System.in); // Allows the user to type a number

        int pick1 = 0; // Starts the number at 0

        while (pick1 < 1 || pick1 > 10) { // Repeats if the number is below 1 OR above 10

            System.out.print("Pick a number from 1 to 10: "); // Asks the user to pick a number

            pick1 = scanner1.nextInt(); // Stores the number the user enters
        }

        System.out.println("Thanks! You picked " + pick1 + "."); // Prints the valid number

        //B3.

        Random random = new Random(); // Creates a Random object

        int roll = 0; // Stores the number rolled
        int count1 = 0; // Counts how many times the die is rolled

        while (roll != 6) { // Keeps looping until a 6 is rolled

            roll = random.nextInt(6) + 1; // Generates a random number from 1 to 6

            System.out.println("Rolled a " + roll); // Prints the number rolled

            count++; // Adds 1 to the roll counter
        }

        System.out.println("It took " + count1 + " rolls to get a 6.");









    }
}
