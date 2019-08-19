package code.school.internship.classes_and_objects.homework.homework12;

class AnotherClass{

    public void method2(){
        throw new ArrayIndexOutOfBoundsException();
    }

    public void method1(){

        try{
            method2();
        }catch (NullPointerException ae){
            System.out.println("Exception caught");
        }finally{
            System.out.println("Method 1 ends");
        }

    }
}

