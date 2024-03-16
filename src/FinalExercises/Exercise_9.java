package FinalExercises;
// this exercise -an application that reads 5 values from the user, places them in an array and then prints out the sum of all the values inside that array.
import java.util.Scanner;
public class Exercise_9 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
            for (int i = 0; i < numbers.length; i++){
                System.out.println("Enter a number " + (i + 1) + ": ");
                numbers[i] = Input.nextInt();
                sum += numbers[i]; }{
        System.out.println("The sum is: " + sum);
            }
        }
    }





