package edu.codeschool.training.classes_objects.homework_13_IO_Streams;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String str="Lesson_13_August_17_Homework.txt";
        File file = new File(str);
        file.createNewFile();
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        String path = separator + "Users" + separator + "haykserobyan" + separator + "Downloads" + separator + "Lesson_13_August_17_Homework.txt";
        FileReader inputStream=null;
        FileWriter outputStream=null;
        try{
            inputStream= new FileReader(file);
            outputStream=new FileWriter("copyhomework13_copy1.txt");
            int c;
            while((c=inputStream.read())!=-1){
                outputStream.write(c);
            }
        }finally{
            if(inputStream!=null){
                inputStream.close();
            }
            if(outputStream!=null){
                outputStream.close();
            }
        }

    }
}