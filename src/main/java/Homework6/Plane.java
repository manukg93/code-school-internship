package Homework6;

public class Plane extends Transport {
    public Plane(){}
    public Plane(String color, double maxSpeed) {
        super(color, maxSpeed);
    }
    @Override
    public String start() {
        return "Start";
    }
    @Override
    public String stop() {
     return "Stop";
    }
    @Override
    public String move(double distance) {
        return "Move";
    }
}
