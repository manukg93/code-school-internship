package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileUtils {

    public static void divide(int x, int y) {
        System.out.println(x / y);
    }


    static void test() throws IOException {
        try{
            throw new IOException("I am IOException");
        } finally {
//            throw new FileNotFoundException();
            System.out.println("cccc");
        }
    }

    public static void openFile() throws Exception {


        File file = new File("D:\\books\\internship_2019_ju\\Lesson_1_June_30_Homework.txt");

        System.out.println(file.exists());

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new Exception("File not exist", e);
        }
    }

    public static void main(String[] args)  {
//        divide(4, 0);
//       try {
//            openFile();
//        } catch (Exception e) {
//           System.out.println(e.getMessage());
//           System.out.println(e.getCause());
//           e.printStackTrace();
//       }finally {
//           System.out.println("AAAAAA");
//
//       }


        try {
            test();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
