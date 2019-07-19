package edu.codeschool.training.classes_objects.homework5;

public class MyMath extends edu.codeschool.training.classes_objects.homework4.MyMath {
    final static double PI=3.14;

//Create method pow(int m, int n) which returns m pow n(m-ի n աստիճանը).
    public static int getPow(int m , int n){
        int temp=1;
        for(int i=1;i<=n;i++){

            temp*=m;

        }return temp;
    }

}
