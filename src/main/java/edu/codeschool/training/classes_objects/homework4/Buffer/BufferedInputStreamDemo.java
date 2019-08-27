package edu.codeschool.training.classes_objects.homework4.Buffer;


import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s="This is symbol of author   &copy;  "+", a &copy no\n" ;
        byte buf[] =s.getBytes();

        ByteArrayInputStream in=new ByteArrayInputStream(buf);
        int c;
        boolean marked=false;

    try (BufferedInputStream f= new java.io.BufferedInputStream(in)) {

        while  ((c=f.read())!=-1){
            switch (c) {
                case '&':
                    if(!marked) {
                        f.mark(32);
                        marked = true;
                    } else{
                        marked=false;
                        }
                    break;
                case ';':
                    if(marked){
                        marked=false;
                        System.out.print("(c)");
                    }else {
                        System.out.print(((char) c));
                    }break;
                case ' ':
                    if(marked)  {
                        marked=false;
                        f.reset();
                        System.out.print("&");
                    }else {
                        System.out.print((char) c);
                        break;
                    }default:

                        if(!marked){
                            System.out.print((char)c);
                        }break;

            }
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
