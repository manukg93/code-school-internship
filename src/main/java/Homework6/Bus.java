package Homework6;
import Homework6.Car;

public class Bus extends Car {
    String direction;
    int quantityPerson;
    public Bus(String a, int b){
        this.direction=a;
        this.quantityPerson=b;
    }

    @Override
    public String toString() {
        return direction + " " + "Max number of persons is " + quantityPerson;
    }
}
