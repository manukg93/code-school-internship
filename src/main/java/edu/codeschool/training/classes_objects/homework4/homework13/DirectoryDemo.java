package edu.codeschool.training.classes_objects.homework4.homework13;

import java.io.*;
import java.io.IOException;
import java.util.stream.Stream;

public class DirectoryDemo {
    public static void main(String[] args) throws IOException {
        String seperator = File.separator;
        String path = seperator + "Users" + seperator + "user" + seperator + "Desktop";

        File dir1 = new File(path, "codeSchoolTrainings");
        dir1.mkdir();

        File dir2 = new File(path + File.separator + "codeSchoolTrainings" + File.separator + "Java");
        dir2.mkdir();

        File original = new File(File.separator + "Users" + File.separator + "user" + File.separator + "Downloads" +
                File.separator + "Lesson_13_August_17_Homework.txt");

        File copy = new File(path + File.separator + "codeSchoolTrainings" + File.separator + "Java" +
                File.separator + "CopyLesson_13_August_17_Homework.txt");
        copy.createNewFile();

        File copy1 = new File(path + File.separator + "codeSchoolTrainings" + File.separator + "Java" +
                File.separator + "CopyCopy_13_August_17_Homework.txt");
        copy1.createNewFile();

        try (FileInputStream f1 = new FileInputStream(original);
             FileOutputStream f2 = new FileOutputStream(copy)) {
            for (int i = 0; i < f1.available(); i++) {
                int c;
                while ((c = f1.read()) != -1) {
                    f2.write((char)c);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //original.deleteOnExit();




        try ( FileInputStream fi1=new FileInputStream(copy);
            FileOutputStream fi2=new FileOutputStream(copy1))   {

            for (int i=0; i<copy.length(); i++){
                int d;
                while ((d=fi1.read())!=-1){
                    fi1.skip(1);
                    fi2.write((char)d);



                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}











