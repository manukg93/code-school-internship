package homework14;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\LENOVO\\Desktop\\java\\resources\\files","file1.txt");
        File file2 = new File("C:\\Users\\LENOVO\\Desktop\\java\\resources\\files","file2.txt");
        File file3 = new File("C:\\Users\\LENOVO\\Desktop\\java\\resources\\files","file3.txt");
        try {
            if (!file1.exists()){
                file1.createNewFile();
            }
            if (!file2.exists()){
                file2.createNewFile();
            }
            if(!file3.exists()){
                file3.createNewFile();
            }
        }catch (IOException e){
            System.out.println(e);
        }
        /*System.out.println(file1.canExecute());
        System.out.println(file2.canRead());
        System.out.println(file3.canWrite());
        System.out.println(file1.compareTo(file2));*/


       //System.out.println(file1.equals(file2));
       // System.out.println(file3.exists());
       // System.out.println(file3.getAbsolutePath());
       // System.out.println(file1.getFreeSpace());
        // System.out.println(file2.getName());
       // System.out.println(file3.getParent());?
       // System.out.println(file3.getParentFile());?


        /*System.out.println(file1.getPath());
        System.out.println(file2.isDirectory());

        System.out.println(file2.isFile());
        System.out.println(file3.isHidden());
        System.out.println(file2.length());*/

       /* String[]names=file1.getParentFile().list();
        for(String name : names){
            System.out.println(name);
        }

        File[]files=file2.getParentFile().listFiles();
        for(File file:files){
            System.out.println(file);
        }*/

       //renameto?
        // setexecutable?
        System.out.println(file1.setReadable(true));
        System.out.println(file2.setReadable(false,true));
        System.out.println(file3.setReadOnly());
        System.out.println(file1.setWritable(true));
        System.out.println(file2.setWritable(false,false));
        System.out.println(file3);


    }
}
