package edu.codeschool.training.classes_objects.homework9_Object_Clone;

public class City implements Cloneable {
    private String name;
    private long countOfResidents;
    private double surface;

    public City() {
        this.name = "Hayk";
        this.countOfResidents = 1;
        this.surface = 1.0;
    }

    public City(String name, long countOfResidents, double surface) {
        this.name = name;
        this.countOfResidents = countOfResidents;
        this.surface = surface;
    }
    public City(City city){
        this.name = city.name;
        this.countOfResidents = city.countOfResidents;
        this.surface = city.surface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCountOfResidents() {
        return countOfResidents;
    }

    public void setCountOfResidents(long countOfResidents) {
        this.countOfResidents = countOfResidents;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        City cloned=(City)super.clone();
        cloned.setName(cloned.getName());
        cloned.setCountOfResidents(cloned.getCountOfResidents());
        cloned.setSurface(cloned.getSurface());
        return cloned;
    }
}
