package edu.codeschool.training.homework14;

import edu.codeschool.training.homework9.immutable_classes.User;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

        System.out.println(File.separator);
        System.out.println(System.getProperty("user.dir"));

        String resourcesRelativePath = "src" + File.separator + "main" + File.separator + "java" + File.separator +"resources"
                + File.separator + "files";

        String resourcesAbsolutePath = System.getProperty("user.dir") + resourcesRelativePath;


        File resources = new File(resourcesAbsolutePath);

        resources.mkdirs();

        // create file1.txt using File(File parent, String child) constructor
        File file1 = new File(resources, File.separator + "file1.txt");

        try {
            file1.createNewFile();
        } catch (IOException ioe) {
            System.out.println("Error1");
        }

        // create file2.txt using File(String pathname) constructor
        File file2 = new File(resourcesRelativePath + File.separator + "file2.txt");
        try {
            file2.createNewFile();
        } catch (IOException ioe) {
            System.out.println("Error2");
        }

        // create file3.txt using File(String parent, String child) constructor
        File file3 = new File( resourcesAbsolutePath, "file3.txt");

        try {
            file3.createNewFile();
        } catch (IOException ioe) {
            System.out.println("Error3");
        }

        // Methods of java.io.File class
        System.out.println("Can Execute: " + file1.canExecute());
        System.out.println("Can Read: " + file2.canRead());
        System.out.println("Can Write: " + file3.canWrite());
        System.out.println(file1.compareTo(file2));
        System.out.println(file3.compareTo(file2));

        //static File createTempFile(String prefix, String suffix)

        System.out.println("file1.txt equals file2.txt: " + file1.equals(file2)); // overrides Object's equals()
        System.out.println("file2.txt exists? " + file2.exists());

        System.out.println("file3.txt absolute path: " + file3.getAbsolutePath());

        long file1FreeSpace = file1.getFreeSpace(); // ???
        System.out.println(file1FreeSpace);

        //
        String name3 = file3.getName();
        System.out.println("Name of file: " + name3);

        String parent3 = file3.getParent();
        System.out.println("Parent directory of file: " + parent3);

        File parentObj = file1.getParentFile();
        System.out.println("file1 parent: " + parentObj);

        String pathFile1 = file1.getPath();
        System.out.println(pathFile1);

        System.out.println("is parentObj directory: " + parentObj.isDirectory());
        System.out.println("is file1 normal file: " + file1.isFile());
        System.out.println("is file2 hidden file: " + file2.isHidden());

        System.out.println("Length of file1 " + file1.length());

        String[] names = parentObj.list();
        for ( String name : names ) {
            System.out.print(name + " ");
        }

        System.out.println();

        File[] files = parentObj.listFiles();
        for ( File file : files ) {
            System.out.println(file);

        }

        //
        //boolean renameTo(File dest)
        //boolean setExecutable(boolean executable)
        System.out.println(file1.setExecutable(true));
        //boolean setReadable(boolean readable)
        System.out.println(file2.setReadable(true));
        //boolean setReadable(boolean readable, boolean ownerOnly)
        System.out.println(file2.setReadable(false, false));
        //boolean setReadOnly()
        System.out.println(file3.setReadOnly());
        //boolean setWritable(boolean writable)
        System.out.println(file2.setWritable(true));
        //String toString()
        System.out.println("file3 toString: " + file3);

        System.out.println("Delete file2: " + file2.delete());




        //System.out.println(file1.delete());

    }
}
