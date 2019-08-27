package edu.codeschool.training.classes_objects.homework4.InputStream_OutputStream;
import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {

        try( FileReader fr=new FileReader("/Users/user/Desktop/hamo/copy"))
        {
            int c;

            while ((c=fr.read())!=-1) System.out.print((char) c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

