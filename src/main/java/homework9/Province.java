package homework9;

import java.util.Arrays;

public class Province implements Cloneable{
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

    @Override
    protected Province clone() throws CloneNotSupportedException {
        return (Province) super.clone();
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
