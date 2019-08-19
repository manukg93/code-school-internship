package code.school.internship.classes_and_objects.homework.homework12;

public class Java_Exception_Quiz_Test2 extends Exception{

    private String message;

    public Java_Exception_Quiz_Test2(){
        this.message = message;
    }

    public static void main(String[] args){

        int a = 5, b = 3;
        try{

            if( a % b > 0 )
                throw new Java_Exception_Quiz_Test2();

        }catch(Exception e){
            System.out.println("Test Exception");
        }
    }

}