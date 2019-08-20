package homework13.ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryRes1 {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Lesson_13_August_17_Homework.txt");
            FileOutputStream file1 = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\AnotherFile.txt")){
            int i;
            while ((i=file.read())!=-1){
                file1.write(i);
            }

        }catch (IOException ex){
            System.out.println(ex);
        }

    }
}
