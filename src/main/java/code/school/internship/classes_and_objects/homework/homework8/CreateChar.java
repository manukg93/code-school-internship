package code.school.internship.classes_and_objects.homework.homework8;

// import code.school.internship.classes_and_objects.homework.homework8.CustomString;

public class CreateChar {
    public static void main(String[] args) {
        char[] characters = {88,100,116,106,111,102};
        CustomString customString = new CustomString(characters);
        System.out.println(customString.charAt(2));
    }
}
