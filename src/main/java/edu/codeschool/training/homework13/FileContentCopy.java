package edu.codeschool.training.homework13;

import java.io.*;
import java.lang.System;

public class FileContentCopy {

    public static void main(String[] args) {

        String userDirectory = System.getProperty("user.dir");
        System.out.println("user directory: " + userDirectory);

        String absolutePath = userDirectory + File.separator + "src" + File.separator + "main" + File.separator + "java"
                + File.separator + "resources" + File.separator + "files" + File.separator;

        File homework13 = new File(absolutePath + "Lesson_13_August_17_Homework.txt");
        File homework13Copy = new File(absolutePath + "Copy_Lesson_13_August_17_Homework.txt");

        try {

            homework13Copy.createNewFile();

        } catch (IOException ioe) {

            System.out.println("file not created " + ioe.getMessage());
        }

        System.out.println(homework13.exists());
        System.out.println();
        //homework13.delete();

        try (FileInputStream fileInputStream = new FileInputStream(homework13);
             FileOutputStream fileOutputStream = new FileOutputStream(homework13Copy))
        {

            int symbol = fileInputStream.read();
            fileOutputStream.write((char) symbol);

            //System.out.print((char) symbol);

            while (symbol != -1) {

                symbol = fileInputStream.read();
                fileOutputStream.write((char) symbol);

                //System.out.print((char)symbol);
            }

        } catch (FileNotFoundException fnfEx) {

            System.out.println("File not found exception: " + fnfEx.getMessage());

        } catch (IOException ioe) {

            System.out.println("IO Exception: " + ioe.getMessage());
        }
    }
}

