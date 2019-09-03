package homework16;

import java.util.Date;

public class Car implements Comparable <Car> {
    private String name;
    private String model;
    private Date date;

    public Car(String name, String model, Date date) {
        this.name = name;
        this.model = model;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int compareTo(Car o) {
    if(this.date.compareTo(o.getDate())>0){
        return 1;
    }
    if(this.date.compareTo(o.getDate())<0){
        return -1;
    }
    return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                '}';
    }
}
