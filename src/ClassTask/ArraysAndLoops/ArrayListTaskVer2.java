package ClassTask.ArraysAndLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTaskVer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // מאתחלים את המשתנים לערכי המקסימום והמינימום האפשריים
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // לולאה שנייה: עיבוד המספרים
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }

        // חישוב הממוצע
        double average = (double) sum / numbers.size();

        // הדפסת התוצאות
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        System.out.println("The average is: " + average);


    }
}
