package homework9;

public class City implements Cloneable  {
    private String name;
    private long countOfResidents;
    private double surface;

    public City(String name, long countOfResidents, double surface) {
        this.name = name;
        this.countOfResidents = countOfResidents;
        this.surface = surface;
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City)super.clone();
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", countOfResidents=" + countOfResidents +
                ", surface=" + surface +
                '}';
    }
}
