package edu.codeschool.training.classes_objects.Homework11_Exception.exercise_2;

public class TestUser {
    public static void main(String[] args) {
        User userDefault=new User();
        try{
            User user=new User("Hayko","asdasda@sdas","sadas");
        }catch(IllegalEmailException ex1){
            System.out.println("Wrong email!!!");
        }catch(IllegalPasswordException ex2){
            System.out.println("Wrong password!!!");
        }

    }
}
