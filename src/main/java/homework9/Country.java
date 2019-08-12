package homework9;

import java.util.Arrays;

public class Country implements Cloneable {
    private int numberOfProvinces;
    private String name;
    private String nationality;
    private City capital;
    private Province[] provinces;



    public Country(String name, String nationality, City capital, Province[] provinces) {
        this.name = name;
        this.nationality = nationality;
        this.capital = capital;
        this.provinces = provinces;
    }
    public Country(Country obj){
        this.numberOfProvinces=obj.numberOfProvinces;
        this.name=obj.name;
        this.nationality=obj.nationality;
        this.capital=new City(obj.capital);
        this.provinces=new Province[numberOfProvinces];
        for (int i = 0; i < numberOfProvinces; i++) {
            this.provinces[i]=obj.provinces[i];
        }
    }

    public int getNumberOfProvinces() {
        return numberOfProvinces;
    }

    public void setNumberOfProvinces(int numberOfProvinces) {
        this.numberOfProvinces = numberOfProvinces;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public City getCapital() {
        return capital;
    }

    public Province[] getProvinces() {
        return provinces;
    }

    @Override
    protected Country clone() throws CloneNotSupportedException {
        Country newCountry=(Country)super.clone();
        newCountry.capital=capital.clone();
        newCountry.provinces=new Province[newCountry.numberOfProvinces];
        for (int i = 0; i <numberOfProvinces ; i++) {
            newCountry.provinces[i]=this.provinces[i].clone();
        }
        return newCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", capital=" + capital +
                ", provinces=" + Arrays.toString(provinces) +
                '}';
    }
}
