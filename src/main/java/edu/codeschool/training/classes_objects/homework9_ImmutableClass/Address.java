package edu.codeschool.training.classes_objects.homework9_ImmutableClass;

public class Address {
    private String street;
    private City city;

    public Address() {
        this.street = "Shahumyan 1st";
        this.city = new City();
    }

    public Address(String street,String city) {
        this.street = street;
        this.city = new City(city);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public void setCity(String name) {
        this.city = new City(name);
    }

    @Override
    public String toString() {
        return  this.street+" "+
                this.city.toString() +", city=" +
                '}';
    }
}
