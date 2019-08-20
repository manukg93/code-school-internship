package edu.codeschool.training.homework13.exercise1;

import java.io.*;

public class UseByteMethod {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int b = 0;

        try {
            fileInputStream = new FileInputStream("Lesson_13_August_17_Homework.txt");
            byte[] bytes = new byte[fileInputStream.available()];
            fileOutputStream = new FileOutputStream("Copy2_Lesson_13_August_17_Homework.txt");
            int i = 0;
            while ((b = fileInputStream.read()) != -1){
                bytes[i] = (byte) b;
                i++;
            }
            fileOutputStream.write(bytes);
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

