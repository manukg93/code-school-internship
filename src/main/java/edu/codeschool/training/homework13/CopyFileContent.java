package edu.codeschool.training.homework13;

import java.io.*;

public class CopyFileContent {

    public static void main(String[] args) {

        byte[] bytes = new byte[20];

        String absolutePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "java"
                + File.separator + "resources" + File.separator + "files" + File.separator;

        File homework13 = new File(absolutePath + "Lesson_13_August_17_Homework.txt");
        File homework13AnotherCopy = new File(absolutePath + "Copy2_Lesson_13_August_17_Homework.txt");

        try {

            homework13AnotherCopy.createNewFile();

        } catch (IOException ioe) {

            System.out.println("IO Exception in creating copy2");
        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            fileInputStream = new FileInputStream(homework13);
            fileOutputStream = new FileOutputStream(homework13AnotherCopy);

            while (fileInputStream.read(bytes) != -1) {

                fileOutputStream.write(bytes);
            }

        } catch (FileNotFoundException fnfEx) {

            System.out.println("File not found: " + fnfEx.getMessage());

        } catch (IOException ioe) {

            System.out.println("IO Exception: " + ioe.getMessage());

        } finally {

            try {

                fileInputStream.close();
                fileOutputStream.close();

            } catch (IOException ioe) {

                System.out.println("IO Exception: " + ioe.getMessage());
            }
        }
    }
}
