package code.school.internship.classes_and_objects.homework.homework6;

public class Plane extends Transport {
    @Override
    public void start() {
        System.out.println("Start!");
    }

    @Override
    public void stop() {
        System.out.println("Stop!");
    }

    @Override
    public void move(double distance) {
        System.out.println("The plane was moved"+distance+"miles");
    }
}