package edu.codeschool.training.homework14;


import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream {

    private static final int BUFFER_DEFAULT_SIZE = 10_000;

    private byte[] buffer;
    private InputStream in;
    int position = -1;
    int count = 0;

    // constructors
    public BufferedInputStream(InputStream inputStream) {
        this.in = inputStream;
        this.buffer = new byte[BUFFER_DEFAULT_SIZE];
    }

    public BufferedInputStream(InputStream inputStream, int size) {
        this.in = inputStream;

        if (size >= 0) {
            this.buffer = new byte[size];
        } else {
            System.out.println("Buffer size < 0");
            this.buffer = new byte[BUFFER_DEFAULT_SIZE];
        }
    }

    // private method
    private void checkCount() {

        if (this.count >= this.buffer.length) {

            this.buffer = new byte[this.buffer.length * 2];
        }
    }

    public byte[] getBuffer() {

        return this.buffer;
    }

    @Override
    public int read () throws IOException {

        if (position < this.count && position != -1) {

            return buffer[position];
        }

        position = 0;
        this.count = this.in.read(buffer);
        checkCount();

        return buffer[position++];
    }
}


