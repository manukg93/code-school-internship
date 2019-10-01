package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class SumArray {
    public static void main(String[] args) throws InterruptedException {
        int [] array =new int[3];
        for(int i=0;i<3;i++){
            array[i]=i;
        }
        SumRun sum1=new SumRun(array,0,array.length/2);
        SumRun sum2=new SumRun(array,array.length/2,array.length);
        Thread thread1=new Thread(sum1);
        Thread thread2=new Thread(sum2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(sum1.getSum()+sum2.getSum());

    }
}
