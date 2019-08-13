package edu.codeschool.training.exceptions.homework11.quiz;

public class Question_4 {
    public static void main(String[] args) {

        try {
            throw new Derived();
        }
        catch (Base b) {
            System.out.println("Caught base class exception");
        }
        //catch (Derived d) {
        //    System.out.println("Caught derived class exception");
        //}
    }
}
