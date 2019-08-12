package code.school.internship.classes_and_objects.homework.homework8;

// import edu.codeschool.training.classes_objects.homework8.exercise2.CustomString;

public class CreateChar {
    public static void main(String[] args) {
        char[] characters = {88,100,116,106,111,102};
        CustomString customString = new CustomString(characters);
        System.out.println(customString.charAt(2));
    }
}
