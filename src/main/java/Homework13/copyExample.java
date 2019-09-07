package Homework13;

import java.io.*;

public class copyExample {
    public static void main(String[] args) throws IOException {
        FileInputStream instream = null;
        FileOutputStream outstrem = null;
        try {
            File from = new File("D:\\my.input.file");
            File to = new File("D:\\my.output.file");

            instream = new FileInputStream(from);
            outstrem = new FileOutputStream(to);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = instream.read(buffer)) > 0) {
                outstrem.write(buffer, 0, length);
            }
            instream.close();
            outstrem.close();
            System.out.println("File copied successfully!!");
        } catch (IOException ioe) {
           ioe.printStackTrace();
        }
    }
}
