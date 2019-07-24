package edu.codeschool.training.interfaces.homework6;

public class Train extends Transport {
    int vagons;

    // Constructors
    public Train() {
        super();
        this.vagons = 1;
    }

    public Train(String color, double maxSpeed, int vagons) {
        super(color, maxSpeed);
        if (vagons > 0) {
            this.vagons = vagons;
        }
    }

    // Setters and getters
    public void setVagons(int vagons) {
        if (vagons > 0) {
            this.vagons = vagons;
        }
    }

    public int getVagons() {
        return this.vagons;
    }

    // Implement methods start(), stop(), move()
    public void start() {
        System.out.println("Train started!");
    }

    public void stop() {
        System.out.println("Train stopped!");
    }

    public void move(double distance) {
        if (distance > 0) {
            System.out.println("Train moved " + distance + " meters");
        }
    }

    @Override
    public String toString() {
        String trainInfo = "Train [Vagons: " + this.getVagons() + ", Color: " + this.getColor()
                + ", Max speed: " + this.getMaxSpeed() + "]";
        return trainInfo;
    }
}
