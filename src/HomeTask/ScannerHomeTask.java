package HomeTask;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = input.nextLine();
        System.out.println("this is my name" + name);

        System.out.println("please enter your last name");
        String lastname = input.nextLine();
        System.out.println("this is my last name" + lastname);

        System.out.println("please enter your city of residence");
        String cityofresidence = input.nextLine();
        System.out.println("this is my city of residence" + cityofresidence);

        System.out.println("please enter your average grade");
        double averagegrade = input.nextDouble();
        System.out.println("this is my average grade" + averagegrade);

        System.out.println("please enter your age");
        int age = input.nextInt();
        System.out.println("this is my age" + age);







    }
}
