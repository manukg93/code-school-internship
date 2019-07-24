package edu.codeschool.training.interfaces.homework6.client;

import edu.codeschool.training.interfaces.homework6.Car;
import edu.codeschool.training.interfaces.homework6.Plane;
import edu.codeschool.training.interfaces.homework6.Train;
import edu.codeschool.training.interfaces.homework6.Transport;

public class TransportManagement {
    public static void main(String[] args) {
        Transport t = new Car("red", 150, "aaa", "bbb");
        t.start();

        t = new Train("grey", 220, 10);
        System.out.println(t);
        t.start();
        t.stop();
        t.move(5000);

        t = new Plane("white", 500, "cat");
        System.out.println(t);
    }
}
