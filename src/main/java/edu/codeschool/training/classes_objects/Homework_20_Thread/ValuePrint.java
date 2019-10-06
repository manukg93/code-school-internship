package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class ValuePrint implements Runnable {
    Resource resource;

    public ValuePrint(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+resource.num);
    }
}
