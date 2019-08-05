package edu.codeschool.training.classes_objects.homework9_Object_Clone;

public class Country implements Cloneable {
    private String name;
    private String nationality;
    private City capital;
    private Province[] province;

    public Country() {
        this.name = "Hayk";
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
    protected Object clone() throws CloneNotSupportedException {
        return (Country) super.clone();
    }
}
