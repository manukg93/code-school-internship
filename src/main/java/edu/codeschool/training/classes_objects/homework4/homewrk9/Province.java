/*package edu.codeschool.training.classes_objects.homework4.homewrk9;

import java.util.Arrays;

public class Province {
    private String name;
    private long mobileCode;
    private City centreCity;
    private City[] cities;


    public Province(String name, long mobileCode, City centreCity, City[] cities) {
        this.name = name;
        this.mobileCode = mobileCode;
        this.centreCity = centreCity;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(long mobileCode) {
        this.mobileCode = mobileCode;
    }

    public City getCentreCity() {
        return centreCity;
    }

    public void setCentreCity(City centreCity) {
        this.centreCity = centreCity;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", mobileCode=" + mobileCode +
                ", centreCity=" + centreCity +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }

    @Override
    protected Province clone() throws CloneNotSupportedException {
        Province cloned=(Province)super.clone();
        cloned.name=this.name;
        cloned.mobileCode=this.mobileCode;
        cloned.centreCity=this.centreCity;
        cloned.cities=this.cities;
        return cloned;
    }
}
*/