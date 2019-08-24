package edu.codeschool.training.homework14.exercise2;

import java.io.IOException;
import java.io.InputStream;
//import java.io.BufferedInputStream;

public class BufferedInputStream extends InputStream{
    byte [] buffer;
    String inputstream;
    public BufferedInputStream(InputStream inputStream) {
    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}
