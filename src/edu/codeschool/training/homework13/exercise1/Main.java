package edu.codeschool.training.homework13.exercise1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int b = 0;
        try {
            fileInputStream = new FileInputStream("Lesson_13_August_17_Homework.txt");
            fileOutputStream = new FileOutputStream("Copy_Lesson_13_August_17_Homework.txt");
            while ((b = fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
