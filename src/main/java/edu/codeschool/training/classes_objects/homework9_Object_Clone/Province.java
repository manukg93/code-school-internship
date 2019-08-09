package edu.codeschool.training.classes_objects.homework9_Object_Clone;

public class Province implements Cloneable {
    private String name;
    private long mobileCode;
    private City centreCity;
    private City[] cities;

    public Province() {
        this.name = "Hayk";
        this.mobileCode = 00374;
        this.centreCity =null;
        this.cities = null;
    }

    public Province(String name, long mobileCode, City centreCity, City[] cities) {
        this.name = name;
        this.mobileCode = mobileCode;
        this.centreCity = centreCity;
        this.cities = cities;
    }
    public Province(Province province){
        this.name=province.name;
        this.mobileCode=province.mobileCode;
        this.centreCity=province.centreCity;
        this.cities=province.cities;
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
    public Object clone() throws CloneNotSupportedException {
        Province cloned = (Province) super.clone();
        cloned.setName(cloned.getName());
        cloned.setMobileCode(cloned.getMobileCode());
        cloned.setCentreCity(cloned.getCentreCity());
        cloned.setCities(cloned.getCities());
        return  cloned;

    }
}
