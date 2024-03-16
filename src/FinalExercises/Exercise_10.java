package FinalExercises;
// this exercise -application that asks the user for 5 numbers , stores them to the ArrayList and returns their average value.
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_10 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = Input.nextInt();
            numberList.add(number);
            sum += number;}
            double average = (double) sum / numberList.size();
                System.out.println("the average is: " + average);
        Input.close();
            }
        }








