package edu.codeschool.training.classes_objects.homework4.homewrk9;

public final class City1 {
    final String name;

    public City1(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City1{" +
                "name='" + name + '\'' +
                '}';
    }
}
