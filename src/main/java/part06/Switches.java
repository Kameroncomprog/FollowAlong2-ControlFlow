package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches {
    // start of the program
    public static void main(String[] args) {
        // we assign string Friday to String variable called day
        String day = "Friday";
        // key word switch means to compare the variable day to case
        switch (day) {
            // the program is checking to see if the variable day has the same value as "Sunday"
            case "Sunday":
                // system outputs It is Sunday
                System.out.println("It is Sunday");
                // means done and gets out of switch
                break;
    }
        // we assign the word Monday to String variable called day1
        String day1 = "Monday";
        // switch compare day what is in day 1 to case
        switch (day1) {
            //means that if the variable inside switch() equals the String "Monday", Java will run the code under that case.
            case "Monday":
                // system outputs It is Monday
            System.out.println("It is Monday");
            // done and jumps out of switch
            break;
    }
    // we assign Tuesday to String variable called day2
    String day2 = "Tuesday";
        // switch comapares whats in day2 to case
        switch(day2) {
            // if the variable inside switch() equals the String "tuesday", java will run the code under that case .
        case "Tuesday":
            // system outputs It is Tuesday
            System.out.println("It is Tuesday");
            // jumps out of switch ends
            break;
    }   // we assign Wednesday to String variable day3
        String day3 = "Wednesday";
        // switch compares day 3 to case top see whats in it
        switch(day3){
            // if the variable inside switch() equals the String "Wednesday", java will run the code under that case .
        case "Wednesday":
            // system outputs It is Wednesday
            System.out.println("it is Wednesday");
            // ends jumps out of switch
            break;
    }   // we assign Thursday to String variable day4
        String day4 = "Thursday";
        // switch compares to case to see hwats in it
        switch(day4){
            // if the variable inside switch() equals the String "Thursday", java will run the code under that case .
        case "Thursday":
            // system outputs It is Thursday
            System.out.println("It is Thursday");
            // ends jumps out of switch
            break;
    }   // we assign friday to String variable to day5
        String day5 = "Friday";
        // switch compares to case to see whats in it
        switch(day5){
            // if the variable inside switch() equals the String "Friday", java will run the code under that case .
        case "Friday":
            // system outputs  It is Friday
            System.out.println("It is Friday");
            //ends jumps out of switch
            break;
    }   // we assign Saturday to String variable day6
        String day6 = "Saturday";
        // switch compares to case to see whats in it
        switch(day6){
            // if the variable inside switch() equals the String "Saturday", java will run the code under that case .
        case "Saturday":
            // system outputs It is Saturday
            System.out.println("It is Saturday");
            // ends jumpsout of switch
            break;
    }   // we assign Pizza to String variable day7
        String day7 = "Pizza";
        // switch has nothing to compare since case is not here
        switch(day7){
            // we put defualt is like else if nothing works then it prints whatever after default
            default:
                // system outputs Pizza is not a day
        System.out.println(day7+ " is not a day");
        }





    }
}
