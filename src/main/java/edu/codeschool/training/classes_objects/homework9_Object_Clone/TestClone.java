package edu.codeschool.training.classes_objects.homework9_Object_Clone;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        City city1 = new City("Aparan", 500, 111);
        City city2 = new City("Yerevan", 1000, 222);
        City[] cities = {city1};
        Province province = new Province("Aparan", 374, city1, cities);
        Province[] provinces = {province};
        Country country = new Country("Armenia", "Armenians", city2, provinces);
        System.out.println(country);
        Country country1 = new Country(country);
        country1.setName("Vanadzor");
        System.out.println(country1);
    }
}
