package HomeTask;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = input.nextLine();
        System.out.println("this is my name" + name);
        System.out.println("please enter your last name");

        String lastname = input.nextLine(); // try to use camle case structure to define you variables. like this lastName. its more easy to read on first sight.
        System.out.println("this is my last name" + lastname);

        System.out.println("please enter your city of residence");
        String cityofresidence = input.nextLine();  // same as here: cityOfResidence
        System.out.println("this is my city of residence" + cityofresidence);

        System.out.println("please enter your average grade");
        double averagegrade = input.nextDouble(); // you get the point :)
        System.out.println("this is my average grade" + averagegrade);

        System.out.println("please enter your age");
        int age = input.nextInt();
        System.out.println("this is my age" + age);

// remove empty lines not in use.
// You did a great job! well done :)






        String LastName = input.nextLine();
        System.out.println("this is my last name" + LastName);
        System.out.println("please enter your city of residence");
        String CityOfResidence = input.nextLine();
        System.out.println("this is my city of residence" + CityOfResidence);
        System.out.println("please enter your averag grade");
        double AverageGrade = input.nextDouble();
        System.out.println("this is my average grade" + AverageGrade);
        System.out.println("please enter your age");
        int age = input.nextInt();
        System.out.println("this is my age" + age);
        


    }
}
