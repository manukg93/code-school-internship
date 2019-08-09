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
    public Country(Country country){
        this.name=country.name;
        this.nationality=country.nationality;
        this.capital=country.capital;
        this.province=country.province;
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
        Country cloned=(Country)super.clone();
        cloned.setName(cloned.getName());
        cloned.setNationality(cloned.getNationality());
        cloned.setCapital(cloned.getCapital());
        cloned.setProvince(cloned.getProvince());
        return cloned;
    }
}
