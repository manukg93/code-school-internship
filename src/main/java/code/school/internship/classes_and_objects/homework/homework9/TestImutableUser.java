package code.school.internship.classes_and_objects.homework.homework9;


// import edu.codeschool.training.homework9.immutable_classes.User;

import java.util.Date;

public class TestImutableUser {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Anna", "Babajanyan st", "Yerevan", new Date(1235487987));
        System.out.println(user1);

        User user2 = user1.clone();
        System.out.println(user1 == user2);
    }
}
