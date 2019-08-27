package edu.codeschool.training.classes_objects.homework4.InputStream_OutputStream;
import java.io.*;

import java.io.File;
import java.io.FileInputStream;

public class FileInputstreamDemo {
    public static void main(String[] args) {
        int size;
       ///Users/user/Downloads Lesson_13_August_17_Homework.txt

        String path= File.separator+"Users"+File.separator+"user"+File.separator+"Downloads"+
                File.separator+"Lesson_13_August_17_Homework.txt";
        try(FileInputStream f=new FileInputStream(path)) {
            System.out.println(size=f.available());
            int n=size/3;
            System.out.println("first"+n+"second");
            for(int i=0; i<n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("kardalu ka der   " + f.available());
            System.out.println("hajor kardalu "+n);

            byte b[]=new byte[n];
            if(f.read(b)!=n){
                System.out.println("chi kara karda  "+n+ "byte");
            }
            System.out.println(new String (b,0,76));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
