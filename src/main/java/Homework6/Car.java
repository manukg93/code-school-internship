package Homework6;

public class Car extends Transport {
    public Car(){}
   public Car(String color, double maxSpeed) {
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
