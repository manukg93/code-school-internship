package edu.codeschool.training.classes_objects.homework9.client;

import edu.codeschool.training.classes_objects.homework9.exercise1.City;
import edu.codeschool.training.classes_objects.homework9.exercise1.Country;
import edu.codeschool.training.classes_objects.homework9.exercise1.Province;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        City city = new City("Armavir", 1221, 12.2);
        City cityCap = new City("Yerevan", 1221, 12.2);
        City[] cities = {city};
        Province province = new Province("Armavir", 374, city, cities);
        Province[] provinces = {province};
        Country country = new Country("Armenia", "Armenians", cityCap, provinces);
        System.out.println(country);
        Country country1 = new Country(country);
        country1.setName("Arcakh");
        System.out.println(country1);
    }
}
