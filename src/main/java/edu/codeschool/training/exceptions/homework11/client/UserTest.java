package edu.codeschool.training.exceptions.homework11.client;

import edu.codeschool.training.exceptions.homework11.IllegalEmailException;
import edu.codeschool.training.exceptions.homework11.IllegalPasswordException;
import edu.codeschool.training.exceptions.homework11.User;

public class UserTest {
    public static void main(String[] args) {
        User user = null;

        try {
            user = new User("Armen", "armen@gmail.com", "armen555");
        }
        catch (IllegalEmailException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IllegalPasswordException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("User: " + user);
        }
    }
}
