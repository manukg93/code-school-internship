package homework13.ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Try2 {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Lesson_13_August_17_Homework.txt");
            FileOutputStream file1 = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\ByteCopy.txt")){

            byte[]bytes=new byte[5];
            file.read(bytes);
            file1.write(bytes);

        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
