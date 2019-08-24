package edu.codeschool.training.homework14.exercise1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file  = new File("/home/gexo/IdeaProjects/homework13/files");
        boolean mkdir = file.mkdir();

        File file1 = new File(file, "file1.txt");
        try {
            final boolean newFile1 = file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File(file.getPath() + File.separator +"file2.txt");
        try {
            final boolean newFile2 = file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file3 = new File(file.getPath(), "file3.txt");
        try {
            final boolean newFile3 = file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println( File.separator);

        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file1.compareTo(file2)); // -10    -1    lexicographically
        System.out.println(file1.createNewFile());
        System.out.println(file.createTempFile("pre", "suf"));
        System.out.println(file3.delete());
        System.out.println(file.equals(file1));
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file1.getParentFile());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.length());
        System.out.println(Arrays.toString(file.list()));
        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(file1.mkdir());
        System.out.println(file1.renameTo(file2));
        System.out.println(file.setExecutable(true));
        System.out.println(file.setReadable(true));
        System.out.println(file.setReadable(true, true));
        System.out.println(file.setReadOnly());
        System.out.println(file.setWritable(true));
        System.out.println(file.toString());
    }
}
