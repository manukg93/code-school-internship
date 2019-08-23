package code.school.internship.classes_and_objects.homework.homework13;


import java.io.FileOutputStream;
import java.io.IOException;

public class System {
    public static void print(String string){
        try (FileOutputStream file = new FileOutputStream("E:\\homework13_Lesson13_Exception.txt",true)){
            byte[] bytes = string.getBytes();
            file.write(bytes);
        }catch (IOException ex){
            ex.printStackTrace();
        }



    }
    public static void println(String string){
        try(FileOutputStream file = new FileOutputStream("E:\\homework13_Lesson13_Exception.txt",true)){
            byte[]bytes=string.getBytes();

            file.write(bytes);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}