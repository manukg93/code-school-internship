package edu.codeschool.training.interfaces.homework6;

public class Car extends Transport {
    String name;
    String model;

    // Constructors
    public Car() {
        super();
        this.name = "Car";
        this.model = "";
    }

    public Car(String color, double maxSpeed, String name, String model) {
        super(color, maxSpeed);
        if (name != null) {
            this.name = name;
        }

        if (model != null) {
            this.model = model;
        }
    }

    // Setters and getters
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }

    public String getModel() {
        return this.model;
    }

    // Implement methods start(), stop(), move()
    public void start() {
        System.out.println("Car started!");
    }

    public void stop() {
        System.out.println("Car stopped!");
    }

    public void move(double distance) {
        if (distance > 0) {
            System.out.println("Car moved " + distance + " meters");
        }
    }

    @Override
    public String toString() {
        String carInfo = "Car [" + this.getName() + ", of model: " + this.getModel() + ", of color: " + this.getColor()
                          + ", of max speed: " + this.getMaxSpeed() + "]";
        return carInfo;
    }
}
