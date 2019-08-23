package code.school.internship.classes_and_objects.homework.homework13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Try_Class {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("E:\\homework13_Lesson13_Exception.txt");
            FileOutputStream file1 = new FileOutputStream("E:\\homework13_Lesson13_Exception.txt")){

            byte[]bytes=new byte[5];
            file.read(bytes);
            file1.write(bytes);

        }catch (IOException ex){
            //System.out.println(ex);
        }
    }
}
