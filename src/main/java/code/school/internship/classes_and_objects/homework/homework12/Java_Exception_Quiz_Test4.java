package code.school.internship.classes_and_objects.homework.homework12;

public class Java_Exception_Quiz_Test4{

    String className;

    public static <Null_PointerException> void main(String[] args){


        try{

            Java_Exception_Quiz_Test4 t = new Java_Exception_Quiz_Test4();
            if(t.className.equals("Test"))
                System.out.print("Test ");
            else
                System.out.print("Other ");

        } catch(NullPointerException ne){
            System.out.print("Null ");
        } catch(Exception e){
            System.out.print("Exception ");
        }

    }

}
