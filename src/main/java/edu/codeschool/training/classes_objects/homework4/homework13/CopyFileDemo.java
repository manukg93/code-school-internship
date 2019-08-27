package edu.codeschool.training.classes_objects.homework4.homework13;
import java.io.*;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {
        String seperator = File.separator;

        String new1 = seperator + "Users" + seperator + "user" + seperator + "Desktop" + File.separator + "hamo" + File.separator + "copy";
        String path1 = File.separator + "Users" + File.separator + "user" + File.separator + "Downloads" +
                File.separator + "Lesson_13_August_17_Homework.txt";

        String new2 = seperator + "Users" + seperator + "user" + seperator + "Desktop" + File.separator + "hamo" + File.separator + "copy1";

        try (FileInputStream f1 = new FileInputStream(path1);
             FileOutputStream f2 = new FileOutputStream(new1)) {
            for (int i = 0; i <= f1.available(); i++) {
                int c;
                while ((c = f1.read()) != -1) {
                    f2.write(c);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }



        try (FileInputStream f3 = new FileInputStream(path1);
            FileOutputStream f4=new FileOutputStream(new2)){
            byte[] bytes = new byte[126];
            for (int i=0; i<bytes.length; i++) {

                f4.write((char)f3.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}