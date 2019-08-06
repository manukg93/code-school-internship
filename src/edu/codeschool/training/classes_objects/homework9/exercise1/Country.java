package edu.codeschool.training.classes_objects.homework9.exercise1;

import java.util.Arrays;

public class Country implements Cloneable {
    private String name;
    private String nationality;
    private City capital;
    private Province[] province;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Province[] getProvince() {
        return province;
    }

    public void setProvince(Province[] province) {
        this.province = province;
    }

    public Country(String name, String nationality, City capital, Province[] province) {
        this.name = name;
        this.nationality = nationality;
        this.capital = capital;
        this.province = province;
    }

    public Country (Country countryObj) throws CloneNotSupportedException {
            this.name = countryObj.name;
            this.nationality = countryObj.nationality;
            this.capital = countryObj.capital;
            this.province = countryObj.province;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", capital=" + capital +
                ", province=" + Arrays.toString(province) +
                '}';
    }
}
