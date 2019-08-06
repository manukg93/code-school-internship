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

    @Override
    protected Country clone() throws CloneNotSupportedException {
        return (Country) super.clone();
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
