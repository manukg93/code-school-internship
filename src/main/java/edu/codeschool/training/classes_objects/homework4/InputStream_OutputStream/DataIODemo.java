package edu.codeschool.training.classes_objects.homework4.InputStream_OutputStream;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        try (DataOutputStream dout=new DataOutputStream(new FileOutputStream("AAAA.dat")) ){

            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("nelzya otkrit etot file");
            return;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("eror  input-output");
        }
        try (DataInputStream din =new DataInputStream(new FileInputStream("AAAA.dat"))){
            double d=din.readDouble();
            int i= din.readInt();
            boolean b=din.readBoolean();

            System.out.println(d+" "+i+" "+" "+b);

        }catch (FileNotFoundException e){
            System.out.println("nelzya otkrit file");
            return;
        }catch (IOException e) {
            System.out.println("eror input-output: "+ e);
        }


    }
}
