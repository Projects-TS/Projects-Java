package HomeTask;

import java.util.Scanner;

public class MonthsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int MonthNumber = scanner.nextInt();
        switch(MonthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 6:
                System.out.println("June");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("There is no such month.");
        }
        scanner.close();

        }
}
