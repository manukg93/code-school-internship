package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Boat extends Transport {
    private String name;

    public Boat(String name, String color, double maxSpeed) {
        super(color, maxSpeed);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void infoBoat(){
        System.out.println("Boat name is : "+ getName()+" , color : "+getColor()+ " , maximum speed is : "+ getMaxSpeed()+ ".");
    }
}
