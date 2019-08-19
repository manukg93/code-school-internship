package homework12.quiz1;
public class Test7 extends Exception{

    public Test7(){}
    public Test7(String str){
        super(str);
    }

    int importantData = 5;
    public static void main(String[] args){
        Test7 t = new Test7();
        t.importantMethod();
    }

    private void importantMethod(){
        if( importantData > 5) //unhandled exception
            throw new Test7("Important data is invalid");
        else
            System.out.println(importantData);
    }

}