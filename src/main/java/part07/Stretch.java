package part07;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.

public class Stretch {
    // start of the program
    public static void main(String[] args) {
        // Assign 7 to int variable x
        int x = 7;
        // system outputs true
        System.out.println(x > 5 && x < 10);
        // System outputs false
        System.out.println(x > 5 && x > 10);
        // system outputs true
        System.out.println(x < 5 || x == 7);
        // system outputs false
        System.out.println(!(x == 7));
        // 3 is assigned to count
        int count = 3;
        //
        while (count > 0) {
            System.out.println("count is " + count);
            // count - 1 everytime the loop runs until count is not greater than 0
            count = count - 1;
        }
        // system outputs done
        System.out.println("done");

        //B1.
        int count1 = 5;
        while (count1 > 0) {
            System.out.println(count1);
            count1--;
        }
        System.out.println("Liftoff!");


        //B2.
        Scanner scanner = new Scanner(System.in);
        String passkey = "";
        while (!passkey.equals("java123")) {
            System.out.println("Password: ");
            passkey = scanner.nextLine();
        }
        System.out.println("Access granted!");

        //B3.
        int number = 0;
        while (number < 1 || number > 10) {
            System.out.print("Pick a number from 1 to 10: ");
            number = scanner.nextInt();
        }
        System.out.println("You picked " + number);





    }
}
