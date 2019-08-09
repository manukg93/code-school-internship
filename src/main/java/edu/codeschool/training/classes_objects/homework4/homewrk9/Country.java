package edu.codeschool.training.classes_objects.homework4.homewrk9;

import java.util.Arrays;

public class Country {
    private String name="Armenia";
    private String natioality="Armenian";
    private City capital;
    private Province[] province;

    public Country(){}

    public Country(String name, String natioality, City capital, Province[] province) {
        this.name = name;
        this.natioality = natioality;
        this.capital = capital;
        this.province = province;
    }
    Country (Country c){
        name=c.name;
        natioality=c.natioality;
        capital=c.capital;
        province=c.province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNatioality() {
        return natioality;
    }

    public void setNatioality(String natioality) {
        this.natioality = natioality;
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
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", natioality='" + natioality + '\'' +
                ", capital=" + capital +
                ", province=" + Arrays.toString(province) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Country cloned=new Country();
        this.name = cloned.getName();
        this.natioality = cloned.getNatioality();
        this.capital = cloned.getCapital();
        this.province = cloned.getProvince();

        return super.clone();
    }
}
