package clone;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Yerevan");
        User user = new User("Aram",address);



       // System.out.println(user.getName());
      //  System.out.println(user1.getName());
    }
}
