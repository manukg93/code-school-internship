package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class Counter implements Runnable {
    Resource resource;

    public Counter(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }

    @Override
    public void run() {
        synchronized (resource) {
            for (int i = resource.num; i < 1_000; i++) {
                resource.incrementNum();
            }
        }
        System.out.println(Thread.currentThread().getName()+" "+ resource.getNum());
    }
}
