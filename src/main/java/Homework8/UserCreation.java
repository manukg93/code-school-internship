package Homework8;
import Homework8.Application;

import java.awt.*;
import java.util.Arrays;

public class UserCreation {
    public static void main(String [] args) {
    Application application = new Application();
    Application.ApplicationType applicationType = new Application.ApplicationType();
    Application.User user = new Application.User("Mane Zakaryan", "Mane Zakaryan", "Facebook");
    Application.User user1 = new Application.User("Mane Zakaryan", "Mane Zakaryan", "Viber");
    Application.User user2 = new Application.User("Mane Zakaryan", "Mane Zakaryan", "Gmail");
    Application.User user3 = new Application.User("Hrant Matevosyan", "1111", "Facebook");
    Application.User user4 = new Application.User("Mane Zakaryan", "Mane Zakaryan", "Facebook");
   user.login();
   user2.login();
   System.out.println(application.toString());
    }
}
