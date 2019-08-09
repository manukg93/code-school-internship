package edu.codeschool.training.classes_objects.homework4.homewrk9;

public class City {
    private String name;
    private long countOfResidents;
    private double surface;

    public City(){}

    public City(String name, long countOfResidents, double surface) {
        this.name = name;
        this.countOfResidents = countOfResidents;
        this.surface = surface;
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
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", countOfResidents=" + countOfResidents +
                ", surface=" + surface +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        City cloned=new City();
        this.name = cloned.getName();
        this.countOfResidents = cloned.getCountOfResidents();
        this.surface = cloned.getSurface();

        return super.clone();
    }
}
