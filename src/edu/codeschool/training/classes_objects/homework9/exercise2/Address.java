package edu.codeschool.training.classes_objects.homework9.exercise2;

public class Address {
    private String street;
    private City city;

    public String getStreet() {
        return street;
    }

//    public void setStreet(String street) {
//        this.street = street;
//    }

    public City getCity() {
        return new City(this.city.getName());
    }

//    public void setCity(City city) {
//        this.city = city;
//    }

    public Address(String street, City city) {
        this.street = street;
        this.city = new City(city.getName());
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city=" + city +
                '}';
    }
}
