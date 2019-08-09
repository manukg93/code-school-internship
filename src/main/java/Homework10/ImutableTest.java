package Homework10;
import java.util.Date;

public class ImutableTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        User user = new User("Mane", "Mikayelyan 3", "Yerevan/Armenia", new Date(156789));
        System.out.println(user);
        User user2 = user.clone();
        System.out.println(user == user2);
    }
}
