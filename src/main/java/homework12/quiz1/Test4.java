package homework12.quiz1;
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
        }catch(NullPointerException ne){ //wrong handle
            System.out.print("Null ");
        }

    }

}