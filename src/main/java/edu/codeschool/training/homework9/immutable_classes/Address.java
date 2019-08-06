package edu.codeschool.training.homework9.immutable_classes;

public class Address {
    // instance fields
    String street;
    City city;

    // default constructor
    public Address() {
        this.street = "street";
        this.city = new City();
    }

    // parameterized constructors
    public Address(String street, String cityName) {
        if (street != null) {
            this.street = street;
        }

        if (cityName != null) {
            this.city = new City(cityName);
        }
    }

    public Address(String street, City city) {
        if (street != null) {
            this.street = street;
        }

        if (city != null) {
            this.city = city;
        }
    }

    // setters and getters

    public void setStreet(String street) {
        if (street != null) {
            this.street = street;
        }
    }

    public void setCity(City city) {
        if (city != null) {
            this.city = city;
        }
    }

    public void setCity(String name) {
        if (name != null) {
            this.city = new City(name);
        }
    }

    public String getStreet() {
        return this.street;
    }

    public City getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "Address [" + this.street + ", " + this.city.toString() + "]";
    }
}
