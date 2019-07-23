package edu.codeschool.training.classes_objects.homework6.client;

import edu.codeschool.training.classes_objects.homework6.exercise3.Boat;
import edu.codeschool.training.classes_objects.homework6.exercise3.Car;
import edu.codeschool.training.classes_objects.homework6.exercise3.Plane;
import edu.codeschool.training.classes_objects.homework6.exercise3.Train;

public class TransportMangement {
    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();
        Boat boat = new Boat();
        Plane plane = new Plane();

        System.out.println(car.toString());
        System.out.println(car.start());
        System.out.println(car.move(200));
        System.out.println(car.stop());
        System.out.println();

        System.out.println(train.toString());
        System.out.println(train.start());
        System.out.println(train.move(200));
        System.out.println(train.stop());
        System.out.println();

        System.out.println(boat.toString());
        System.out.println(boat.start());
        System.out.println(boat.move(200));
        System.out.println(boat.stop());
        System.out.println();

        System.out.println(plane.toString());
        System.out.println(plane.start());
        System.out.println(plane.move(200));
        System.out.println(plane.stop());
    }
}
