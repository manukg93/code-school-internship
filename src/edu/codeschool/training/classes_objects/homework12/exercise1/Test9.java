package edu.codeschool.training.classes_objects.homework12.exercise1;

public class Test9 extends Exception{

    public Test9(){}
    public Test9(String str){
        super(str);
    }

    int importantData = 5;
    public static void main(String[] args){
        Test9 t = new Test9();
        t.importantMethod();
    }

    private void importantMethod(){
        if( importantData > 5)
            try {
                throw new Test9("Important data is invalid");
            } catch (Test9 test9) {
                test9.printStackTrace();
            }
        else
            System.out.println(importantData);
    }

}