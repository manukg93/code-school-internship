package edu.codeschool.training.classes_objects.homework12.exercise1;

import java.io.IOException;

public class Test8{

    public static void main(String[] args){


        try{

            Test8 t = new Test8();
            t.doNothing();
            System.out.println("I have done nothing");
            throw new IOException();
        }catch(IOException e){
            System.out.println("Exception1");
        }
    }

    private void doNothing(){
        for(int i = 0 ; i < 10; i++){
        }
    }
}