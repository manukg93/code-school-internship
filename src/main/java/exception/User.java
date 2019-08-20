package exception;

public class User {
    public static int x = 4;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        User user1 = new User("A");
        user1.x = 15;
        User user2 = new User("B");
        user2.x = 0;
        System.out.println(user1.x == user2.x);
    }

}
