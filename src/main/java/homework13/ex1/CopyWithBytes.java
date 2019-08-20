package homework13.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyWithBytes {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Lesson_13_August_17_Homework.txt");
            FileOutputStream file1 = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\ByteCopy.txt");

            byte[]bytes=new byte[5];
            file.read(bytes);
            file1.write(bytes);

            file.close();
            file1.close();
        }catch (IOException ex){
            System.out.println(ex);
        }

    }
}
