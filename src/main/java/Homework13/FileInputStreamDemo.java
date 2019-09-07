package Homework13;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamDemo {
    public static void main(String args[]){
    int size;
    try ( FileInputStream f = new FileInputStream("myFile.txt")) {
        System.out.println("General quantity of accessible bites: " + (size = f.available()));
        int n = size/40;
        System.out.println("First " + n + " bites, " + "read from file with the order of method read()");
        for (int i=0; i<n; i++) {
            System.out.println((char) f.read());
        }
        System.out.println("\nstill accessible: " + f.available());
        System.out.println("Read following " + n + " bites with the order of method read(b[])");
        byte b[] = new byte[n];
        if (f.read(b) != n) {
            System.err.println(
                    "Not allowed to read " + n + " bites."
            );
        }
        System.out.println(new String (b, 0, n));
        System.out.println("\nAll still accessible: " + (size = f.available()));
        System.out.println("Skip rest bites with the method skip()");
        f.skip(size/2);
        System.out.println("Still accessible: " + f.available());
        System.out.println("Reading " + n/2 + " bites, in the end of the array");
        if (f.read(b, n/2,n/2) != n/2) {
            System.err.println( "Not allowed " + n/2 + " bites.");
        }
        System.out.println(new String (b, 0, b.length));
        System.out.println("\nall still accessible: " + f.available());
    } catch (IOException e) {
        System.out.println("Error input-output: " + e);
    }
    }
}