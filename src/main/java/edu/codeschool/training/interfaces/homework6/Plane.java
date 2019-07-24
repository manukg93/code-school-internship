package edu.codeschool.training.interfaces.homework6;

public class Plane extends Transport {
    String category;

    // Constructors
    public Plane() {
        super();
        this.category = "";
    }

    public Plane(String color, double maxSpeed, String category) {
        super(color, maxSpeed);
        if (category != null) {
            this.category = category;
        }
    }

    // Setters and getters
    public void setCategory(String category) {
        if (category != null) {
            this.category = category;
        }
    }

    public String getCategory() {
        return this.category;
    }

    // Implement methods start(), stop(), move()
    public void start() {
        System.out.println("Plane started!");
    }

    public void stop() {
        System.out.println("Plane stopped!");
    }

    public void move(double distance) {
        if (distance > 0) {
            System.out.println("Plane moved " + distance + " meters");
        }
    }

    @Override
    public String toString() {
        String planeInfo = "Plane [" + this.getCategory() +", " + this.getColor() + ", " + this.getMaxSpeed() + "]";
        return planeInfo;
    }
}
