package edu.codeschool.training.homework13.exercise4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class System {
    private static void createFile(){
        File file = new File("sout.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void print( String string) {
        createFile();
        try(FileOutputStream fileOutputStream = new FileOutputStream("sout.txt",true)) {
            byte[] bytes = string.getBytes();
            fileOutputStream.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void println(String string) {
        createFile();
        createFile();
        try(FileOutputStream fileOutputStream = new FileOutputStream("sout.txt",true)) {
            byte[] bytes = string.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.write('\n');

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
