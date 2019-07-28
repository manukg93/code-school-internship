package Homework6;

public abstract class Transport implements Vehicul {
    public String color;
    public double maxSpeed;
    public Transport(){}
    Transport(String color, double maxSpeed){
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
