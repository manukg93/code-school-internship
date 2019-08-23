package edu.codeschool.training.classes_objects.homework_13_IO_Streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDirectory {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "haykserobyan" +
                separator + "Downloads" + separator + "Lesson_13_August_17_Homework.txt";
        File dir1 = new File("codeSchoolTrainings");
        dir1.mkdir();
        File dir2 = new File(dir1, "java");
        dir2.mkdir();
        File originalFile = new File(path);
        File copyFile = new File(dir2, "Lesson_13_August_17_Homework_COPY.txt");
        copyFile.createNewFile();
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader(originalFile);
            outputStream = new FileWriter(copyFile);
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
       // copyFile.deleteOnExit();
    }
}