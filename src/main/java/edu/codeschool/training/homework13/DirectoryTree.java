package edu.codeschool.training.homework13;

import java.io.*;

public class DirectoryTree {

    public static void main(String[] args) {

        File directoryCodeSchool = new File(System.getProperty("user.dir") + "/src/main/java/resources/code_school_trainings");
        directoryCodeSchool.mkdir();

        File directoryJava = new File(directoryCodeSchool.getParentFile(), "/code_school_trainings/java");
        directoryJava.mkdir();

        File aaaFile = new File(directoryCodeSchool.getParentFile(), "/files/aaa.txt");
        System.out.println(aaaFile.exists());

        try {

            if (aaaFile.renameTo(new File(directoryJava.getParent() + File.separator + "java"+ File.separator + aaaFile.getName())))  {

                System.out.println("File is moved successful");

            } else {

                System.out.println("File move failed");
            }
        } catch (Exception ex) {

            System.out.println(ex.getStackTrace());
        }

        try {

            aaaFile.deleteOnExit();

        } catch (Exception ex) {

            System.out.println(ex.getStackTrace());
        }

        // create another file in java directory
        File anotherFile = new File(directoryJava.getParent() + File.separator + "java" + File.separator + "file13.txt");

        try {

            anotherFile.createNewFile();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }

        // copy content from Lesson_13_August_17_Homework.txt, skipping first 10 bytes use skip(n) method of InputStream
        File lesson13 = new File(directoryCodeSchool.getParentFile(), File.separator + "files" + File.separator
                + "Lesson_13_August_17_Homework.txt");


        System.out.println(lesson13.exists());
        System.out.println(lesson13.getPath());


        try (FileInputStream fileInputStream = new FileInputStream(lesson13);
        FileOutputStream fileOutputStream = new FileOutputStream(anotherFile))
        {
            System.out.println("skipped " + fileInputStream.skip(10) + " bytes");

            int abyte = fileInputStream.read();


            while ( abyte != -1) {

                abyte = fileInputStream.read();
                fileOutputStream.write((char) abyte);

            }

        } catch (FileNotFoundException ex) {

            System.out.println("File not found: " + ex.getMessage());

        } catch (IOException ex) {

            System.out.println("IO Exception: " + ex.getMessage());
        }
    }
}
