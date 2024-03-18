package FinalExercises;

//this exercise is for checking the input year he was born and how old he will be 20 years later.
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("hi, how old are you?");
        int age = Input.nextInt();
        int ageIn20Years = age + 20;
        int currentYear = 2024 - age; // Here you could use: int year = Calendar.getInstance().get(Calendar.YEAR); assuming you don't know the current year.
        System.out.println("That means you were born in " + currentYear);
        System.out.println("That means that in 20 years you will be " + ageIn20Years + " years old!");
    }
}
