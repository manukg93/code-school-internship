package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Train extends Transport {
    private String name;

    public Train(String name, String color, double maxSpeed) {
        super(color, maxSpeed);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void infoTrain(){
        System.out.println("Train name is : "+ getName()+" , color : "+getColor()+ " , maximum speed is : "+ getMaxSpeed()+ ".");
    }
    public void infoType(){
        System.out.println(" Driving on the rails ! ! !");
    }
}
