package homework12.quiz2;

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try {
            throw new IOException();
        }catch (IOException | Exception ex){ //wrong handle..IO is subclass of Exception
            System.out.println(ex + "handled");
        }
    }
}
