package code.school.internship.classes_and_objects.homework.homework11;

class ExceptionTest1 {
    public static void main(String[] args) {
        try{
            System.out.println("in try block");
            System.exit(0);
        }finally{
            System.out.println("finally block executed");
        }
    }
}
