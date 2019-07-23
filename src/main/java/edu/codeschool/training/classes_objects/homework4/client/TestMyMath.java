package edu.codeschool.training.classes_objects.homework4.client;

        import edu.codeschool.training.classes_objects.homework4.homework5.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        MyMath m=new MyMath();
        int []intArray= new int[]{1,2,8,3,6,5,4,7,8,9};
        double []doubleArray=new double[]{1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01};

        System.out.print("Min int     - ");
        System.out.println(MyMath.min(new int[]{1,2,8,3,6,5,4,7,8,9}));

        System.out.print("Max int     - ");
        System.out.println(MyMath.max(new int[]{1,2,8,3,6,5,4,7,8,9}));

        System.out.print("Min double  - ");
        System.out.println(MyMath.min(new double[]{1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01}));

        System.out.print("Max double  - ");
        System.out.println(MyMath.max(new double[]{1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01}));

        System.out.print("Sum int     - ");
        System.out.println(MyMath.sum(new int[]{1,2,8,3,6,5,4,7,8,9}));

        System.out.print("Sum double  -");
        System.out.println(MyMath.sum(new double[]{1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01}));

        System.out.print("Mull int    - ");
        System.out.println(MyMath.mull(new int[]{1,2,8,3,6,5,4,7,8,9}));

        System.out.print("Mull double - ");
        System.out.println(MyMath.mull(new double[]{1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01}));

        System.out.print("3 pow 7     - ");
        System.out.println(MyMath.pow(3,7));

        //MyMath.isPrime(1489775697);

    }
}
