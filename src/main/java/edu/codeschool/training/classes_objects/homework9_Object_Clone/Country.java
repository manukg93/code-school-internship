package edu.codeschool.training.classes_objects.homework9_Object_Clone;

import java.util.Arrays;

public class Country implements Cloneable {
    private String name;
    private String nationality;
    private City capital;
    private Province[] province;
    private int numberOfProvince;

    public Country() {
        this.name = "Armenia";
        this.nationality = "armenian";
        this.capital = null;
        this.province = null;
    }

    public Country(String name, String nationality, City capital, Province[] province) {
        this.name = name;
        this.nationality = nationality;
        this.capital = capital;
        this.province = province;
    }
    //copy constructor
    public Country(Country country) {
        this.numberOfProvince = country.numberOfProvince;
        this.name = country.name;
        this.nationality = country.nationality;
        this.capital = new City(country.capital);
        this.province = new Province[this.numberOfProvince];

        for (int i = 0; i < this.numberOfProvince; i++) {
            this.province[i] = new Province(country.province[i]);
        }
    }

    public int getNumberOfProvince() {
        return numberOfProvince;
    }

    public void setNumberOfProvince(int numberOfProvince) {
        this.numberOfProvince = numberOfProvince;
    }

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Country country = (Country) super.clone();
        country.capital = (City) this.capital.clone();
        country.province = new Province[country.numberOfProvince];

        for (int i = 0; i < numberOfProvince; i++) {
            country.province[i] = (Province) this.province[i].clone();
        }
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", capital=" + capital +
                ", province=" + Arrays.toString(province) +
                ", numberOfProvince=" + numberOfProvince +
                '}';
    }
}
