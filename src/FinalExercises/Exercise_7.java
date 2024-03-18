package FinalExercises;

import java.util.Scanner;
// this exercise is for inputting number until we input 0 and then it calculate the rest of the numbers and give us min and max.
public class Exercise_7 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number; // you don't need to initialize the number
        while (true) {
            System.out.println("Enter a number ");
            number = Input.nextInt();
            { //remove the closure parentheses
             if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

        }
    }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
