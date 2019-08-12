package homework11.ex2;

public class UserTest {
    public static void main(String[] args) {
        try {
            User user = new User("user1","emai@l","12345");
        }catch (IllegalPasswordException ex){
            System.out.println("illegal password");
        }catch (IllegalEmailException ex){
            System.out.println("illegal email");
        }


    }
}
