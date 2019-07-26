package code.school.internship.classes_and_objects.homework.homework6;

public class Boat extends Transport {
    public Boat() {
    }

    public Boat(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

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
        System.out.println("The boat was moved"+distance+"miles");
    }
}
