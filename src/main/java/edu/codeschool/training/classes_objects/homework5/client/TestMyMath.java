package edu.codeschool.training.classes_objects.homework5.client;
import edu.codeschool.training.classes_objects.homework5.MyMath;
public class TestMyMath {
    public static void main(String[] args) {
        int [] intArray  = {1,2,8,3,6,5,4,7,8,9};
        double [] doubleArray  = {1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01};
        //Calcualate 3 pow 7
       // Check weather the 1489775697 is prime or not.
        System.out.println(MyMath.getMax(intArray,intArray.length));
        System.out.println(MyMath.getMin(intArray,intArray.length));
        System.out.println(MyMath.getIntSum(intArray,intArray.length));
        System.out.println(MyMath.getMull(intArray,intArray.length));
        System.out.println(MyMath.getDoubleMax(doubleArray,doubleArray.length));
        System.out.println(MyMath.getDoubleMin(doubleArray,doubleArray.length));
        System.out.println(MyMath.getDoubleSum(doubleArray,doubleArray.length));
        System.out.println(MyMath.getDoubleMull(doubleArray,doubleArray.length));
        System.out.println(MyMath.getIsPrime(1489775697));
        System.out.println(MyMath.getPow(3,7));
    }
}
