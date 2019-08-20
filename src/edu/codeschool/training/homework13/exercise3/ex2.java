package edu.codeschool.training.homework13.exercise3;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex2 {
    public static void main(String[] args) {
        int b = 0;
        try(FileInputStream fileInputStream = new FileInputStream("Lesson_13_August_17_Homework.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("AnOtherFile.txt");) {
            File file = new File("AnOtherFile.txt");
            file.createNewFile();
            fileInputStream.skip(10);

            while ((b = fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
