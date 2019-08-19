package code.school.internship.classes_and_objects.homework.homework12;

public class Java_Exception_Quiz_Test1 extends Exception{

    public static void main(String[] args){

        try{

            System.out.println("My Custom Exception test");
            throw new Java_Exception_Quiz_Test1();

        }catch(Exception e){
            System.out.println("Test Exception");
        }
    }

}
