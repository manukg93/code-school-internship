package edu.codeschool.training.homework14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferInputStream {

    public static void main(String[] args) throws IOException {

        BufferedInputStream bufInputStream = new BufferedInputStream(System.in);

        bufInputStream.read();

        byte[] bytes = bufInputStream.getBuffer();

        for (int i = 0; i < bufInputStream.count; i++) {

            System.out.print((char) bytes[i]);
        }
    }
}
