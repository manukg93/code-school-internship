package edu.codeschool.training.classes_objects.homework4.InputStream_OutputStream;
import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String seperator=File.separator;
        String path=seperator+"Users"+seperator+"user"+seperator+"Desktop";
        String source1="es cragravorox kdarnam te che??";
        String sourse2="vax@ dasi chenq";

        byte buf1[]=source1.getBytes();
        byte buf2 []=sourse2.getBytes();
        FileOutputStream f1=null;
        FileOutputStream f2=null;
        FileOutputStream f3=null;

        try{
            f1=new FileOutputStream(path+File.separator+"hamo"+File.separator+"file1.txt");
            f2=new FileOutputStream(path+File.separator+"hamo"+File.separator+"file2.txt");
            f3=new FileOutputStream("file3.txt");


                f1.write(buf1);


                f2.write(buf2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
