package Homework6.Tests;

import Homework6.*;

public class TransportManagement {
    public static void main(String[] args) {
        Car a = new Car("Red", 500);
        Train b = new Train ("Black", 100);
        Plane c = new Plane ("White", 1000);
        Boat d = new Boat ("White", 800);
        Bus e = new Bus ("Malatia / isakov / Prospect / Baghramyan", 48);
        System.out.println("For the Car " + a.start() + " - " + a.stop() + " - " + a.move(1.0));
        System.out.println(a.maxSpeed + " " + a.color);
        System.out.println("For the Train " + b.start() + " - " + b.stop() + " - " + b.move(8.0));
        System.out.println(b.maxSpeed + " " + b.color);
        System.out.println("For the Plane " + c.start() + " - " + c.stop() + " - " + c.move(6.0));
        System.out.println(c.maxSpeed + " " + c.color);
        System.out.println("For the Boat " + d.start() + " - " + d.stop() + " - " + d.move(4.0));
        System.out.println(d.maxSpeed + " " + d.color);
        System.out.println("For the Bus " + e.start() + " - " + e.stop() + " - " + e.move(4.0));
        System.out.println("New bus specification " + e.toString());

    }
}
