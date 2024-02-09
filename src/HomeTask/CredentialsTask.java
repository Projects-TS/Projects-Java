package HomeTask;

import javax.swing.*;
import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String UserName = "tal";
        String Password = "1992";

        System.out.print("Enter Username: ");
        String InputUserName = scanner.nextLine();
        System.out.print("Enter Password: ");
        String InputPassword = scanner.nextLine();

        if(UserName.equals(InputUserName) && Password.equals(InputPassword)) {
            System.out.println("Welcome user " + InputUserName);
        } else {
            System.out.println("User not found.");
        }

    }

}
