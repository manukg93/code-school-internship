package homework9;

import java.util.Arrays;

public class Country implements Cloneable {
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
        newCountry.provinces=provinces.clone();
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
