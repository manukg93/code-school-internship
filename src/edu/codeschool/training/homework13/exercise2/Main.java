package edu.codeschool.training.homework13.exercise2;

import java.io.*;
import java.nio.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        File file = new File("codeSchoolTrainings/java");
        file.mkdir();
//        file.mkdir("codeSchoolTrainings/java");

        File source = new File("Lesson_13_August_17_Homework.txt");
        File dest = new File("codeSchoolTrainings/java/Lesson_13_August_17_Homework.txt");

        try {
            Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING); // |StandardCopyOption| if file already copied
//
//            Files.copy(
//                    Paths.get("codeSchoolTrainings/java/Lesson_13_August_17_Homework.txt"),
//                    Paths.get("Lesson_13_August_17_Homework.txt"),
//                    StandardCopyOption.REPLACE_EXISTING);

                    System.out.println(source + " :- copied. ");


        } catch (IOException e) {
            e.printStackTrace();
        }

        source.deleteOnExit();
        System.out.println(source + " :- This file will delete on exit. ");
        System.out.printf( "Дpyгoй Формат отрицатель ных чисел с " +
        " плав ающей точкой : %,(f\n)", -1234567.123);
    }
}

class AnOtherFile{
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int b = 0;
        try {
            File file = new File("AnOtherFile.txt");
            file.createNewFile();

//            Writer writer = new FileWriter("AnOtherFile.txt");
////            writer.flush();
//            writer.close();

        fileInputStream = new FileInputStream("Lesson_13_August_17_Homework.txt");
        fileInputStream.skip(10);
        fileOutputStream = new FileOutputStream(file);

            byte[] bytes = new byte[fileInputStream.available()];
            int i = 0;
        while ((b = fileInputStream.read()) != -1){

//            fileOutputStream.write(b);
            bytes[i] = (byte)b;
            i++;
        }
            fileOutputStream.write(bytes, 10, i-11);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert fileInputStream != null;
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
