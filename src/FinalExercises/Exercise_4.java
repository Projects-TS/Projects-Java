package FinalExercises;
import java.util.Scanner;
//this exercise - reads the input and The application converts and prints that value in Fahrenheit.
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the temperature in Celsius: ");
        double celsius = Input.nextDouble();
        // this is what we need to use for the code to work and convert from celsius to fahrenheit.
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + "°C is equivalent to " + fahrenheit + "°F.");
        Input.close();
        }
    }

