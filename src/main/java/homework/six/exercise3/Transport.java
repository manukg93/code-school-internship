package homework.six.exercise3;

public abstract class Transport implements Vehicle {
    protected String color;
    protected double maxSpeed;
    public Transport(){}

    public Transport(String color, double maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
