package edu.codeschool.training.homework9;

public class Province implements Cloneable {

    // instance fields
    private int numberOfCities;
    String name;
    long mobileCode;
    City centreCity;
    City[] cities;

    // constructors
    // default constructor
    public Province() {
        this.numberOfCities = 0;
        this.name = "Province";
        this.mobileCode = 0;
        this.centreCity = new City();
        cities = new City[numberOfCities];
    }

    // parameterized constructor
    public Province (String name) {
        if (name != null) {
            this.name = name;
        }
        this.numberOfCities = 0;
        this.mobileCode = 0;
        this.centreCity = new City();
        cities = new City[numberOfCities];
    }

    // copy constructor
    public Province(Province provinceObj) {
        if (provinceObj != null) {
            this.numberOfCities = provinceObj.numberOfCities;
            this.name = provinceObj.name;
            this.mobileCode = provinceObj.mobileCode;
            this.centreCity = new City(provinceObj.centreCity);
            this.cities = new City[this.numberOfCities];

            for (int i = 0; i < this.numberOfCities; i++) {
                this.cities[i] = provinceObj.cities[i];
            }
        }
    }

    // setters and getters
    public void setNumberOfCities(int cities) {
        if (cities > 0) {
            this.numberOfCities = cities;
        }
    }

    public int getNumberOfCities() {
        return this.numberOfCities;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setMobileCode(long mobileCode) {
        if (mobileCode > 0) {
            this.mobileCode = mobileCode;
        }
    }

    public long getMobileCode() {
        return this.mobileCode;
    }

    public void setCentreCity(String name) {
        if (name != null) {
            this.centreCity = new City(name);
        }
    }

    public void setCentreCity (City centreCity) {
        if (centreCity != null) {
            this.centreCity = centreCity;
        }
    }

    public City getCentreCity() {
        return this.centreCity;
    }

    public void setCities(City[] cities) {
        if (cities != null) {
            this.cities = cities;
        }
    }

    @Override
    public Province clone() throws CloneNotSupportedException {
        Province p = (Province) super.clone();
        p.centreCity = this.centreCity.clone();
        p.cities = new City[p.numberOfCities];

        for (int i = 0; i < this.numberOfCities; i++) {
            p.cities[i] = this.cities[i].clone();
        }
        return p;
    }

    @Override
    public String toString() {
        String aboutProvince = "Province [Name: " + this.name + ", Centre: " + this.centreCity.toString() +
                ", Mobile Code: " + this.mobileCode + ", Cities: ";

        for (City c : this.cities) {
            aboutProvince += c.toString() + "\n";
        }
        return aboutProvince + "]";
    }
}
