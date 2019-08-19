package code.school.internship.classes_and_objects.homework.homework12;

public class Java_Exception_Quiz_Test7 extends Exception{

    public Java_Exception_Quiz_Test7(){}
    public Java_Exception_Quiz_Test7(String str){
        super(str);
    }

    int importantData = 5;
    public static void main(String[] args) throws Java_Exception_Quiz_Test7 {
        Java_Exception_Quiz_Test7 t = new Java_Exception_Quiz_Test7();
        t.importantMethod();
    }

    private void importantMethod() throws Java_Exception_Quiz_Test7 {
        if( importantData > 5)
            throw new Java_Exception_Quiz_Test7("Important data is invalid");
        else
            System.out.println(importantData);
    }

}
