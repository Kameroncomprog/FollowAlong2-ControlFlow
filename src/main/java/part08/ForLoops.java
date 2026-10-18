package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class ForLoops {
    // start of the program
    public static void main(String[] args) {
        // if i <= 10 you count up by +1 until you get to 10
        for (int i = 0; i <= 10; i++) {
            // system prints I which is each number after going through the loop
            System.out.println(i);
        }
        // system outputs after the final number which is 10 Happy new year that is why this print statment is outside the loop.
        System.out.println("Happy New Year!");
    }
}
