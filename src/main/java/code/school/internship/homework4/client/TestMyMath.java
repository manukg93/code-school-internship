package code.school.internship.homework4.client;

import code.school.internship.homework4.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int [] intArray = {1,2,3,4,5,6,7,8,9};
        double [] doubleArray ={1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01};

math.min(intArray);
math.max(intArray);
math.sum(intArray);
math.mull(intArray);
        System.out.println();
math.min(doubleArray);
math.max(doubleArray);
math.sum(doubleArray);
math.mull(doubleArray);
        System.out.println();
math.isPrime(1489775697);
    }
}
