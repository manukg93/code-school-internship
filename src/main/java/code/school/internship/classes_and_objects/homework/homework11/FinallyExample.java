package code.school.internship.classes_and_objects.homework.homework11;

class FinallyExample {
    public static void main(String[] args) {
        try{

            /* Infinite for loop*/
            for(;;){
                System.out.println("in try block - Infinite for loop");
            }
        }finally{
            System.out.println("finally block executed");
        }
    }
}