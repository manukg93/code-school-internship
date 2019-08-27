package edu.codeschool.training.classes_objects.homework4.InputStream_OutputStream;

import java.io.File;
import java.io.IOException;

public class FileDemoCopy {
    public static void main(String[] args) throws IOException {
        String seperator= File.separator;
        String path=seperator+"Users"+seperator+"user"+seperator+"Desktop";
        File dir=new File(path,"hamo");
        dir.mkdir();
        System.out.println(dir.isDirectory());
        File file =new File(dir,"text");
        file.createNewFile();

    }
}
