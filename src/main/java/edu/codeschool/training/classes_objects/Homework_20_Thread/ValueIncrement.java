package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class ValueIncrement implements Runnable {
    Resource resource;

    public ValueIncrement(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.incrementNum();
        System.out.println(Thread.currentThread().getName()+" "+ resource.num);
    }
}
