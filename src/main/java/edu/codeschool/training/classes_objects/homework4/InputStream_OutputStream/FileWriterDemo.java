package edu.codeschool.training.classes_objects.homework4.InputStream_OutputStream;

import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) {

        String source= "Now is the time for all good man\n "+ "to come to the aid for their country\n"+
                "and pay their due taxes.";

        char buffer[]=new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try
         (FileWriter f1= new FileWriter("file1.txt");
         FileWriter f2= new FileWriter("file2.txt");
         FileWriter f3= new FileWriter("file3.txt")){

             for (int i=0; i<buffer.length; i++){
                 f1.write(buffer[i]);
             }
             f2.write(buffer,buffer.length-buffer.length/2,buffer.length/2);
             f3.write(buffer, 0,buffer.length/2);

        }catch (IOException e) {
            System.out.println("eror");
        }




    }
}