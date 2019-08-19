package code.school.internship.classes_and_objects.homework.homework12;

public class Java_Exception_Quiz_Test5{

    public static void main(String[] args){

        try{

            String[] names = {"Jack", "John", "Jill"};
            printNames(names);

        }catch(NameIsJohnException e){
            System.out.print("NameIsJohnException ");
        }
    }

    private static void printNames(String[] names) throws NameIsJohnException{
        for(String name : names){
            if(name.equals("John")) {
                throw new NameIsJohnException("Name cannot be John ");
            }

            System.out.print(name + " ");
        }
    }
}