package code.school.internship.classes_and_objects.homework.homework12;

public class Java_Exception_Quiz_Test3{

    public static void main(String[] args){

        try{

            Java_Exception_Quiz_Test3 t = new Java_Exception_Quiz_Test3();
            int d = t.getNum(2, 5);
            System.out.println(d);

        }catch(Exception e){
            System.out.print("Exception 1 ");
        }
    }

    public int getNum(int a, int b){

        int c = 0;
        try{

            c = a * b;
            if(c > 10);
                // throw new String("Cannot be more than 10 ");

        }catch(Exception e){
            System.out.print("Exception 2 ");
        }

        return c;
    }

}
