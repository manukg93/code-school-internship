package edu.codeschool.training.classes_objects.homework12.exercise1;

public class Test4{

    String className;

    public static void main(String[] args){


        try{

            Test4 t = new Test4();
            if(t.className.equals("Test"))
                System.out.print("Test ");
            else
                System.out.print("Other ");

        }catch(Exception e){
            System.out.print("Exception ");
        }
//        catch(NullPointerException ne){
//            System.out.print("Null ");
//        }

    }

}
