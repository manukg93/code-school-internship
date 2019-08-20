package edu.codeschool.training.homework13.exercise3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) {
        int b = 0;
        try(FileInputStream fileInputStream = new FileInputStream("Lesson_13_August_17_Homework.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("Copy_Lesson_13_August_17_Homework.txt")) {

            while ((b = fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class useByteMethod{

    public static void main(String[] args) {
        int b = 0;
        try(FileInputStream fileInputStream = new FileInputStream("Lesson_13_August_17_Homework.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("Copy3_Lesson_13_August_17_Homework.txt")) {
            byte[] bytes = new byte[fileInputStream.available()];
            int i = 0;
            while ((b = fileInputStream.read()) != -1){
                bytes[i] = (byte) b;
                i++;
            }
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
