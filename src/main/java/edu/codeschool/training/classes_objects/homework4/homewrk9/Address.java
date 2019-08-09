package edu.codeschool.training.classes_objects.homework4.homewrk9;

public final  class Address {
    final String street;
    final City city;


    public Address(String street, City city){
        this.street=street;
        this.city=city;

    }

    public String getStreet() {
        return street;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city=" + city +
                '}';
    }
}
