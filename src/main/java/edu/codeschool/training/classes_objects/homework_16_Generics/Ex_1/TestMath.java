package edu.codeschool.training.classes_objects.homework_16_Generics.Ex_1;

import edu.codeschool.training.classes_objects.homework_16_Generics.Ex_1.Math;

import java.util.Date;

public class TestMath {
    public static void main(String[] args){
        System.out.println(Math.max(new Integer[]{1, 3, 6, 20}));
        System.out.println(Math.max(new Double[]{1.0, 3.6, 3.5, 20d}));
        System.out.println(Math.max(new Long[]{1l, 3l, 6l, 100l,}));
        System.out.println(Math.max(new String[]{"ABCdef", "ABC", "ABCD", "ABCDE"}));

        System.out.println(Math.min(new String[]{"ABCdef", "ABC", "ABCD", "ABCDE"}));
        System.out.println(Math.min(new Long[]{1l, 3l, 6l, 100l,}));
        System.out.println(Math.min(new Integer[]{1, 3, 6, 20}));
        System.out.println(Math.min(new Double[]{1.0, 3.6, 3.5, 20d}));


        Math.bubbleSort(new String[]{"ABC", "AB", "A", "ABCDEf","ABCD","abc"});
        Math.bubbleSort(new Integer[]{1,28, 3, 6, 20});

        Math.reverseList(new String[]{"A", "AB", "ABC", "ABCD","ABCDE"});
        Math.reverseList(new Integer[]{1,2,3,4,5});

        Math.searchElementContain(new String[]{"A", "AB", "ABC", "ABCD","ABCDE"}, "ABC");
        Math.searchElementContain(new Integer[]{1,2,3,4,5}, 6);

        Math.subArray(new String[]{"A", "AB", "ABC", "ABCD","ABCDE"},1,4);

        Car car1=new Car("Mercedes","C180",new Date (1994,1,10));
        Car car2=new Car("BMW","E46",new Date(1995,2,10));
        Car car3=new Car("BMW","E92",new Date(2013,2,10));
        Car car4=new Car("BMW","E90",new Date(2011,3,10));

        System.out.println(car1);
        System.out.println(car2);
        Math.reverseList(new Car []{car1,car2,car3});
        Math.bubbleSort(new Car []{car2,car1,car3,car4});

    }

}
