package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11–1:36:00 for the three parts of a for loop
// Guide: GUIDE.md in this folder, steps 2–5 and 8
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        // 1 2 3
        for (int i = 1; i <= 3; i++) {
            // i is 5
            System.out.print(i + " ");
        }
        // i is 3
        System.out.println();
        for (int i = 5; i > 0; i -= 2) {
            // i is 1
            System.out.println("i is " + i);
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                // ***
                System.out.print("*");
            }
            // ***
            System.out.println();
        }


        //B1.

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");


        //B2.

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        //B3.

        for (int row = 1; row <= 5; row++) { // Outer loop controls the rows

            for (int col = 1; col <= 5; col++) { // Inner loop controls the columns

                System.out.print(row * col + "\t"); // Multiplies row and column, then adds a tab
            }

            System.out.println(); // Moves to the next row
        }















    }
}
