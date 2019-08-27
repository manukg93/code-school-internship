package edu.codeschool.training.classes_objects.homework4.ByteArrayInputStream_ByteArrayOutputStream;
import java.io.*;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {

     //Reset

        String tmp ="abc";
        byte [] b=tmp.getBytes();
        java.io.ByteArrayInputStream in= new java.io.ByteArrayInputStream(b);

        for(int i=0; i<2; i++){
            int c;
            while((c=in.read())!=-1){
                if(i==0){
                    System.out.print((char) c);

                }else {
                    System.out.print(Character.toUpperCase((char) c));
                }
            }System.out.println();
            in.reset();
        }

    }

}
