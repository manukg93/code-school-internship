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
    public City(City obj){
        this.name=obj.name;
        this.countOfResidents=obj.countOfResidents;
        this.surface=obj.surface;
    }

    public String getName() {
        return name;
    }

    public long getCountOfResidents() {
        return countOfResidents;
    }

    public double getSurface() {
        return surface;
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
