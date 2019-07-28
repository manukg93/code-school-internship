package Homework6;

public class Boat extends Transport {
    public Boat(){}
    public Boat(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public String start() {
        return "start";
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
