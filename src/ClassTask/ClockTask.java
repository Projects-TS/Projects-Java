package ClassTask;

import java.util.Scanner;
public class ClockTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a specific time: ");
        int time = input.nextInt();
        int minutes = time % 100;
        int hours = time / 100;
        System.out.println("The formatted time is: " + hours + ":" + minutes);
    }
}