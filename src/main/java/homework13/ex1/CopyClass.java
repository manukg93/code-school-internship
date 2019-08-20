package homework13.ex1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyClass  {
    public static void main(String[] args)  {
        try{
            FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Lesson_13_August_17_Homework.txt");
            int i;

            FileOutputStream file1 = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\AnotherFile.txt");
            while ((i=file.read())!=-1){
                file1.write(i);
            }
            file.close();
            file1.close();
        }catch (IOException ex){
            System.out.println(ex);
        }


    }
}
