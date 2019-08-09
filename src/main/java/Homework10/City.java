package Homework10;

public class City implements Cloneable {
    String name;
    long countOfResidents;
    double surface;
City(String name, long countOfResidents, double surface) {
    this.name=name;
    this.countOfResidents=countOfResidents;
    this.surface=surface;
}

    public City() {
        
    }

    public City(String cityName) {
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
    public void setName(String name) {
        this.name = name;
    }
    public void setCountOfResidents(long countOfResidents) {
        this.countOfResidents = countOfResidents;
    }
    public void setSurface(double surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return name + " " + countOfResidents + " " + surface;
    }

  @Override
 protected Object clone() throws CloneNotSupportedException {
       return super.clone();
  }
}
