package HomeTask;

import java.util.Scanner;

public class CreditCardTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int CardNumber = 12131415;
        String Password = "credit";

        for (int attempts = 0; attempts < 5; attempts++) {
            System.out.print("Please enter your card number (8 digits): ");
            int Number = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Please enter your password: ");
            String password = scanner.nextLine();

            if (Number == CardNumber && password.equals(Password)) {
                System.out.println("Welcome user " + "tal");
                break;
            } else {
                if (attempts < 4) {
                    System.out.println("Incorrect details, try again.");
                }
            }
            if (attempts == 3) {
                System.out.println("you have one more try.");
            }
            if (attempts == 4) {
                System.out.println("Your card has been blocked.");
            }
        }
    }
}
