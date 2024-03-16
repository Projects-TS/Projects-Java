package FinalExercises;
// this exercise - the computer chooses a value between 1 and 99 in random.
//The application gives the user seven attempts to try and guess the value the computer has chosen
//After each guess the computer will tell the user if his guess is correct or larger or smaller than the chosen value.
import java.util.Random;
import java.util.Scanner;
public class Exercise_8 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(99) + 1;
        for (int attempts = 0; attempts < 7; attempts++) {
            System.out.print("Please enter your numbers: ");
            int random = Input.nextInt();
            if (random == randomNum) {
                System.out.println("Correct");
                break;
            }if (random < randomNum) {
                    System.out.println("Smaller");
                }
                if ( random > randomNum) {
                    System.out.println("Bigger");
                }
                    if (attempts > 6) {
                        System.out.println("You have guessed wrong");
                    }
                }
            }
        }


