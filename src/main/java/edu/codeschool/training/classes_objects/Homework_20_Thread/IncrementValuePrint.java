package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class IncrementValuePrint {
    public static void main(String[] args) {
        Resource resource=new Resource(100);
        ValueIncrement valueIncrement=new ValueIncrement(resource);
        ValuePrint valuePrint=new ValuePrint(resource);
        Thread thread1=new Thread(valuePrint);
        Thread thread2=new Thread(valueIncrement);
        thread1.start();
        thread2.start();

    }
}
