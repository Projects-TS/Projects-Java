package FinalExercises;
// this exercise is for asking the user how old is he.
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("hi, what is your age?");
        int age = Input.nextInt();
        System.out.println("Well, now I know you are " + age + " years old!");
    }
}
