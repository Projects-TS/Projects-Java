package ClassTask.LogicalOperators;

import java.util.Scanner;

public class IfElseElseIIfTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int UserNumber = input.nextInt();

//        if (UserNumber == 0){
//            System.out.println("A number is zero");
//        } else if (UserNumber % 2 == 0) {
//            System.out.println("A number " + UserNumber + " is even");
//        } else {
//            System.out.println("A number " + UserNumber + " is odd");
//        }
        // a second way to do it >
//        String message = (UserNumber == 0) ? "A number is zero"
//                : (UserNumber % 2 == 0) ? "A number " + UserNumber + " is even"
//                : "A number " + UserNumber + " is odd";
        String message = (UserNumber == 0) ? "A number is zero"
                : (UserNumber % 2 == 0) ? "A number " + UserNumber + " is even"
                : "A number " + UserNumber + " is odd";
        System.out.println("message = " + message);
    }
}
