package homework12.quiz1;
import java.io.IOException;

public class Test6{

    public static void main(String[] args){


        try{

            Test6 t = new Test6();
            t.doNothing();
            System.out.println("I have done nothing");

        }catch(IOException e){ //exception is never thrown
            System.out.println("Exception1");
        }
    }

    private void doNothing(){
        for(int i = 0 ; i < 10; i++){
        }
    }
}