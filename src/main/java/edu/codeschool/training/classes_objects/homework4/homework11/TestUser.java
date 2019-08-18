package edu.codeschool.training.classes_objects.homework4.homework11;

public class TestUser {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u);
        try {
            u.setEmail("hamlet888mail@mail.ru");
            u.setPassword("123456");
        } catch (IllegalEmailException e) {
            System.out.println("email should contain @");

        }catch (IllegalPasswordException e){
            System.out.println("password length should be minimum 8 characters");
        }

    }
}