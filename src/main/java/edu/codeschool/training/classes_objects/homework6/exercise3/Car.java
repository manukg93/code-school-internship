package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Car extends Transport {
    private String name;

    public Car(String name, String color, double maxSpeed) {
        super(color, maxSpeed);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String infoCar(){
        return "Car name is : "+ getName()+" , color : "+getColor()+ " , maximum speed is : "+ getMaxSpeed()+ " .";
    }
    public String infoType(){
        return " type of CAR ! ! ! ";
    }
}

