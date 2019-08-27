package edu.codeschool.training.classes_objects.homework4.ByteArrayInputStream_ByteArrayOutputStream;

import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f= new ByteArrayOutputStream();

        String s= "This content must be copy in array";
        byte buf []=s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("eror");
            return;
        }

        System.out.println("bufer");
        System.out.println(f.toString());
        System.out.println("in array");
        byte b[]=f.toByteArray();

        for(int i=0; i<b.length; i++)   System.out.print((char) b[i]);

        System.out.println("\nB  potok vivoda type Outputstream");

        try( FileOutputStream f2 =new FileOutputStream("hamo.txt")) {

            f.writeTo(f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("eror input-output:  " + e);
            return;
        }
        System.out.println("first situation");
        f.reset();

        for(int i=0; i<3; i++)  f.write((char) 'X');

            System.out.println(f.toString());



    }
}




