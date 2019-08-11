package edu.codeschool.training.classes_objects.homework9_ImmutableClass;

public class City {
    private String name;

    public City() {
        this.name = "Erevan";
    }

    public City(String cityName) {
        this.name = cityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String cityName) {
        this.name = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
