package edu.codeschool.training.classes_objects.homework4.homework14;

import java.io.*;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String seperator = File.separator;
        String path = seperator + "Users" + seperator + "user" + seperator + "Documents" + seperator + "JAVA" + seperator + "resources" +
                seperator + "files";
        File file = new File(path);
        file.mkdirs();
        String path1=path+seperator+"file1.txt";
        File file1=new File(path1);
        file1.createNewFile();

        File file2=new File(file,"file2.txt");
        file2.createNewFile();

        File file3=new File(path,"file3.txt");
        file3.createNewFile();



        System.out.println("Execute  "+file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file2.compareTo(file));
        System.out.println(file1.createNewFile());
        System.out.println(file.createTempFile("Java",null));
        System.out.println(file.delete());
        System.out.println(file2.equals(file3));
        System.out.println(file3.exists());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file3.getFreeSpace());
        System.out.println(file1.getName());
        System.out.println(file2.getParent());
        System.out.println(file3.getParentFile());
        System.out.println(file1.getPath());
        System.out.println(file.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file1.isHidden());
        System.out.println(file1.length());
        System.out.println(Arrays.toString(file.list()));
        System.out.println(file.listFiles());
        //file2.renameTo(new File(path+seperator+"file7.txt"));
        file1.setExecutable(false, false);
        file2.setReadable(true,true);
        file3.setWritable(false,false);
        System.out.println(file1.toString());

    }

}