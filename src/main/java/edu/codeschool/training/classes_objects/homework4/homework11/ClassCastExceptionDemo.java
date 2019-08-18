package edu.codeschool.training.classes_objects.homework4.homework11;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        String country="Armenia";
    }
}
class Person extends  ClassCastExceptionDemo{
    String name="Hamo";
}
class Student extends Person{
    int age=29;
}
 class Test {
     public static void main(String[] args) {
         ClassCastExceptionDemo c = new ClassCastExceptionDemo();
         try {
             Student st = (Student) new Person();
         } catch (ClassCastException e) {
             System.out.println("can not be cast");
         }
     }

 }