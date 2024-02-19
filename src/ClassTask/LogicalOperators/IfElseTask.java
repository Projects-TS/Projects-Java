package ClassTask.LogicalOperators;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number: ");

        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " even ");
        } else {
            System.out.println(number + " odd ");}
    }
}
