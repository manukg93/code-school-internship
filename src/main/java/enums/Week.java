package enums;

import java.util.Comparator;

public enum  Week {
    SUNDAY("SUNDAY",50),MONDAY("MONDAY"),TUESDAY("TUESDAY",5);

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    protected enum Color{

    }
    interface A{}

    class  B{}

    Week(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Week(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
