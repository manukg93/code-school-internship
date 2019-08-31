package edu.codeschool.training.classes_objects.homework4.homework16;

import java.util.Arrays;
import java.util.Date;

public class TestMath {
    public static void main(String[] args) {

       Integer []intArray={1, 4, 5, 32, 7, 53, 21, 9, 0, 42};
       Double [] doubleArray={2.3, 4.02, 3.7, 7.0, 9.3, 6.5, 11.4, 34.8, 0.06, };
       Character[] charArray={'A','j','c','P','u','E','Y','G','s','N'};


        Car car1=new Car("BMW","X6",new Date(1990,10,10));
        Car car2=new Car("Mercedec","E200",new Date(2000,10,10));
        Car car3=new Car("Lada","06",new Date(1988,8,6));
        Car car4=new Car("Toyota","Camry",new Date(2010,5,20));
        Car car5=new Car("OPEL","Astra G",new Date(1995,12,22));
        Car[]car={car1,car2,car3,car4,car5};


        System.out.println("-----------------------------------------------");
        System.out.print("Minimum   ");
        System.out.println(Math.min(charArray));
        System.out.println("-----------------------------------------------");
        System.out.print("Maximum   ");
        System.out.println(Math.max(doubleArray));
        System.out.println("-----------------------------------------------");
        System.out.print("BuubleSort   ");
        System.out.println(Arrays.toString(Math.bubbleSort(intArray)));
        System.out.println("-----------------------------------------------");
        System.out.print("Reverse   ");
        System.out.println(Arrays.toString(Math.revers(intArray)));
        System.out.println("-----------------------------------------------");
        System.out.print("Search   ");
        System.out.println(Arrays.toString(Math.serach(doubleArray, 6.7)));
        System.out.println("-----------------------------------------------");
        System.out.print("SubArray   ");
        System.out.println(Arrays.toString(Math.subArray(charArray,4,10)));
        System.out.println("-----------------------------------------------");
        //System.out.println(car1.toString().compareTo(car2.toString()));



    }
}
