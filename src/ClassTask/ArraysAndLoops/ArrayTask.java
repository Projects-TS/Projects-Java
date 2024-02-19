package ClassTask.ArraysAndLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTask {
    public static void main(String[] args) {
        int[] numbers ={15, 30, 45};
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("the average is: " + average);
    }
}
