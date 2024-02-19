package ClassTask;

import java.util.ArrayList;
import java.util.Scanner;


public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their age
        System.out.println("Hi, what is your age?");

        // Read the age from user input
        int age = scanner.nextInt();

        System.out.println("i see and what is your friend age?");

        int age1 = scanner.nextInt();


        // Print the greeting message with the user's age
        System.out.println("Well, now I know you are " + age + " years old! and your friend is " + age1 + " years old!");

        // Close the scanner
        scanner.close();
    }
}