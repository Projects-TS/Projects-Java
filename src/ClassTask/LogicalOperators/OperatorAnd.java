package ClassTask.LogicalOperators;

import java.util.Scanner;

public class OperatorAnd {
    public static void main(String[] args) {
                            // true && true
        System.out.println(5 > 4 && 6 > 5);

                            // false && true
        System.out.println(5 < 4 && 6 > 5);

                            // false && false
        System.out.println(5 < 4 && 6 < 5);

                            // true && false
        System.out.println(5 > 4 && 6 < 5);

        String realusername = "username";
        String realpassword = "password";

        Scanner input = new Scanner(System.in);

        System.out.println("enter your username: ");
        String actualusername = input.nextLine();
        System.out.println("enter your password: ");
        String actualpassword = input.nextLine();

        System.out.println(realpassword.equalsIgnoreCase(actualpassword)
                && realusername.equalsIgnoreCase(actualusername));

    }
}
