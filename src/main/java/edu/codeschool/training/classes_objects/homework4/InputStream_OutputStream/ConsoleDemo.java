package edu.codeschool.training.classes_objects.homework4.InputStream_OutputStream;

import java.io.*;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;


        con=System.console();

        if(con==null) return;

        str =con.readLine("Write String : ");
        con.printf("Writer String: %s\n", str);

    }
}
