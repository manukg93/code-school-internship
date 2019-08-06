package Homework10;

public class Province implements Cloneable {
    String name;
    long mobileCode;
    City centreCity;
    City[] cities;
    Country country = new Country();
    Province() {
    this.name="Shushan Zakaryan";
    this.mobileCode=156;
    this.centreCity=null;
    this.cities=null;
    }
    Province(String name, long mobileCode, City centreCity, City[] cities){
        this.name=name;
        this.mobileCode=mobileCode;
        this.centreCity=centreCity;
        this.cities=cities;
    }
    public String getName() {
        return name;
    }
    public long getMobileCode() {
        return mobileCode;
    }
    public City getCentreCity() {
        return centreCity;
    }
    public City[] getCities() {
        return cities;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMobileCode(long mobileCode) {
        this.mobileCode = mobileCode;
    }
    public void setCentreCity(City centreCity) {
        this.centreCity = centreCity;
    }
    public void setCities(City[] cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return name + " " + mobileCode + " " + cities + " " + centreCity;
}

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Province province = (Province)super.clone();
       province.country=new Country();
       return province;
    }
}

