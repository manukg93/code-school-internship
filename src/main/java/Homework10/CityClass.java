package Homework10;

public class CityClass {
    String name;
    CityClass(){
        this.name = "Name";
    }
    CityClass(String name){
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Name " + name;
    }
}
