package homework9;

import java.util.Arrays;

public class Province implements Cloneable{
    private int numberOfCities;
    private String name;
    private long mobileCode;
    private City centerCity;
    private City[] cities;

    public Province(String name, long mobileCode, City centerCity, City[] cities) {
        this.name = name;
        this.mobileCode = mobileCode;
        this.centerCity = centerCity;
        this.cities = cities;
    }
    public Province(Province obj){
     this.numberOfCities=obj.numberOfCities;
     this.mobileCode=obj.mobileCode;
     this.centerCity=obj.centerCity;
     this.cities = new City[this.numberOfCities];
        for (int i = 0; i <numberOfCities ; i++) {
            this.cities[i]=obj.cities[i];
        }
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    public String getName() {
        return name;
    }

    public long getMobileCode() {
        return mobileCode;
    }

    public City getCenterCity() {
        return centerCity;
    }

    public City[] getCities() {
        return cities;
    }

    @Override
    protected Province clone() throws CloneNotSupportedException {
        Province prov = (Province)super.clone();
        prov.centerCity=centerCity.clone();
        prov.cities = new City[numberOfCities];
        for (int i = 0; i < numberOfCities ; i++) {
            prov.cities[i]=cities[i].clone();
        }
        return prov;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", mobileCode=" + mobileCode +
                ", centerCity=" + centerCity +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
