package homework12.quiz1;
public class Test2 extends Exception{

    private String message;

    public Test2(String message){
        this.message = message;
    }

    public static void main(String[] args){

        int a = 5, b = 3;
        try{

            if( a % b > 0 )
                throw new Test2(); //costructor

        }catch(Exception e){
            System.out.println("Test Exception");
        }
    }

}