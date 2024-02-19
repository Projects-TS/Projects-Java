package ClassTask.ArraysAndLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " );
            int number = scanner.nextInt();
            numberList.add(number);

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum += number;
        }

        double average = (double) sum / 3.0;
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("the average is: " + average);


        scanner.close();
    }
    }

