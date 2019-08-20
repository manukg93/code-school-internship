package homework13.ex4;

import java.io.FileOutputStream;
import java.io.IOException;

public class System {
    public static void print(String string){
        try (FileOutputStream file = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\sout.txt",true)){
        byte[] bytes = string.getBytes();
        file.write(bytes);
        }catch (IOException ex){
            ex.printStackTrace();
        }



    }
    public static void println(String string){
        try(FileOutputStream file = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\sout.txt",true)){
            byte[]bytes=string.getBytes();

            file.write(bytes);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
