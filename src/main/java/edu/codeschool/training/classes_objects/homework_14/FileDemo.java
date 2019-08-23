package edu.codeschool.training.classes_objects.homework_14;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        String separator=File.separator;
        String path=separator+"Users"+separator+"haykserobyan"+separator+"Documents"+separator+
                "JAVA"+separator+"resources"+separator+"files";
        File file=new File(path);
        file.mkdirs();
        String path1=path+separator+"file1.txt";
        File file1=new File(path1);
        file1.createNewFile();
        File file2=new File(file,"file2.txt");
        file2.createNewFile();
        File file3=new File(path,"file3.txt");
        file3.createNewFile();


        System.out.println(file.canExecute());
        System.out.println(file3.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.compareTo(file3));
        file3.createNewFile();
        System.out.println(file3.getAbsoluteFile());
        System.out.println(file.createTempFile("Temp",null));
        file3.createTempFile("Temp",null);
        System.out.println(file1.getTotalSpace());
        System.out.println(file2.getTotalSpace());
        System.out.println(file.getTotalSpace());
        //file3.deleteOnExit();
        System.out.println(file.getCanonicalFile());
        System.out.println(file.isHidden());
        System.out.println(file1.toString());
        System.out.println(file1.length());
        System.out.println(file2.length());
        System.out.println(file3.length());
        System.out.println(file1.equals(file2));
        System.out.println(file.exists());
        System.out.println(file1.exists());
        System.out.println(Arrays.toString(file.list()));
        System.out.println(Arrays.toString(file.listFiles()));
        //file1.renameTo(new File(path+separator+"Hayk.txt"));
        //file1.setExecutable(false,true);

        file2.setReadable(false);
        file3.setWritable(false,false);
        System.out.println(file2);

    }

}
