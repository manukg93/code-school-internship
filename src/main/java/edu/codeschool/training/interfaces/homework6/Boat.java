package edu.codeschool.training.interfaces.homework6;

public class Boat extends Transport {
    int shovel;

    // Constructors
    public Boat() {
        super();
        this.shovel = 1;
    }

    public Boat(String color, double maxSpeed, int shovels) {
        super(color, maxSpeed);
        if (shovels > 0) {
            this.shovel = shovels;
        }
    }

    // Setters and getters
    public void setShovel(int shovels) {
        if (shovels > 0) {
            this.shovel = shovels;
        }
    }

    public int getShovel() {
        return this.shovel;
    }

    // Implement methods start(), stop(), move()
    public void start() {
        System.out.println("Boat started!");
    }

    public void stop() {
        System.out.println("Boat stopped!");
    }

    public void move(double distance) {
        if (distance > 0) {
            System.out.println("Boat moved " + distance + " meters");
        }
    }

    @Override
    public String toString() {
        String boatInfo = "Boat has " + this.getShovel() + " shovels," + this.getColor() + " color and "
                + this.getMaxSpeed() + "max speed";
        return boatInfo;
    }
}
