package ClassTask.LogicalOperators;

import java.util.Scanner;

public class OperatorIfElseIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age: ");

        int age = scanner.nextInt();

        // 17 | 18-30 | 31 - 50 | 51

        if (age < 18) {
            System.out.println("under 18");
        }
        else if (age >= 18 && age <= 30){
            System.out.println("range of 18-30");
        } else if (age >= 31 && age <= 50) {
            System.out.println("range of 31-50");
        } else if (age >= 50 && age <= 100) {
            System.out.println("range of 51-100");
        } else  {
            System.out.println("not valid age please try again...");
        }


    }
}


