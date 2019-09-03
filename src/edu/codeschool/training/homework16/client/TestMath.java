package edu.codeschool.training.homework16.client;

import edu.codeschool.training.homework16.exercise1.Car;
import edu.codeschool.training.homework16.exercise1.Math;

import java.util.Arrays;
import java.util.Date;

public class TestMath {
    public static void main(String[] args) {
        Car car1 = new Car("C-240", "Mercedes", new Date(2004, 2, 17));
        Car car2 = new Car("X5", "BMW", new Date(2002, 6, 17));
        Car car3 = new Car("Passat", "Volkswagen", new Date(2006, 3, 17));
        Car car4 = new Car("A4", "Audi", new Date(2001, 8, 17));
        Car car5 = new Car("A5", "Audi", new Date(2000, 8, 17));

        Car[] carArray = {car1,car2,car3,car4};

        Math<Car> math = new Math<Car>();
        System.out.println(Arrays.toString(carArray));
        System.out.println(math.max(carArray));
        System.out.println(math.min(carArray));
        System.out.println(Arrays.toString(math.sort(carArray)));
        System.out.println(Arrays.toString(math.reverse(carArray)));
        System.out.println(math.search(carArray, car3));
        System.out.println(Arrays.toString(math.subArray(carArray,1,2)));

    }

}
