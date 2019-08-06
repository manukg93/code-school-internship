package edu.codeschool.training.homework9;

public class Country implements Cloneable {

    // instance fields
    private int numberOfProvinces;
    String name;
    String nationality;
    City capital;
    Province[] provinces;

    // constructors
    // default constructor
    // parameterized constructor
    public Country(int numberOfProvinces) {
        if (numberOfProvinces > 0) {
            this.numberOfProvinces = 0;
        }
        this.name = "Country";
        this.nationality = "";
        this.capital = new City();
        this.provinces = new Province[numberOfProvinces];
    }

    // copy constructor
    public Country (Country countryObj) throws CloneNotSupportedException {
        if (countryObj != null) {
            this.numberOfProvinces = countryObj.numberOfProvinces;
            this.name = countryObj.name;
            this.nationality = countryObj.nationality;
            this.capital = new City(countryObj.capital);
            this.provinces = new Province[this.numberOfProvinces];

            for (int i = 0; i < this.numberOfProvinces; i++) {
                this.provinces[i] = new Province(countryObj.provinces[i]);
            }
        }
    }

    // setters and getters
    public void setNumberOfProvinces(int numberOfProvinces) {
        if (numberOfProvinces > 0) {
            this.numberOfProvinces = numberOfProvinces;
        }
    }

    public int getNumberOfProvinces() {
        return this.numberOfProvinces;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setNationality(String nationality) {
        if (nationality != null) {
            this.nationality = nationality;
        }
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setCapital(City capital) {
        if (capital != null) {
            this.capital = capital;
        }
    }

    public void setCapital(String name) {
        if (name != null) {
            this.capital = new City(name);
        }
    }

    public City getCapital() {
        return this.capital;
    }

    public void setProvinces(Province[] provinces) {
        if (provinces != null) {
            this.provinces = provinces;
        }
    }

    public Province[] getProvinces() {
        return this.provinces;
    }

    @Override
    public Country clone() throws CloneNotSupportedException {
        Country ct = (Country) super.clone();
        ct.capital = this.capital.clone();
        ct.provinces = new Province[ct.numberOfProvinces];

        for (int i = 0; i < numberOfProvinces; i++) {
            ct.provinces[i] = this.provinces[i].clone();
        }



        return ct;
    }

    @Override
    public String toString() {
        String aboutCountry = "Country: [" + this.getName() + ", Capital: " + this.getCapital().toString() +
                ", Nationality: " + this.getNationality() + ", \nProvinces: ";
        for (Province pr : this.provinces) {
            aboutCountry += "\n" + pr.toString();
        }
        return aboutCountry + "]";
    }
}
