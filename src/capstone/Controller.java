package capstone;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws IOException, SQLException {
        boolean isExistingUser;
        User existingUser = new User();
        User newUser = new User();
        Database database = new Database();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to your Budgeting App! Let's get started.");
        System.out.println("Have you entered your information before? (true or false)");
        isExistingUser = userInput.nextBoolean();
        if (isExistingUser) {
            String emailAddress;
            System.out.println("Enter your email address ");
            emailAddress = userInput.next();
            existingUser = Service.getUserData(emailAddress);
            Service.openMainMenu(existingUser);
        } else {
            System.out.println("Let's setup your budget information. Don't worry, you'll only need to do this once! " +
                    "Once complete, you can change your information at any time.");
            Service.createUserAccount(newUser);
            Service.openMainMenu(newUser);
        }

    }
}
