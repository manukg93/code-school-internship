package edu.codeschool.training.classes_objects.homework4.homewrk9;

import edu.codeschool.training.classes_objects.homework4.homework6.Date;
import sun.jvm.hotspot.debugger.Address;

public final  class User {
    final String name;
    final Address address;
    final Date birthDay;

    public User(String name, Address address, Date birthDay){
        this.name=name;
        this.address=address;
        this.birthDay=birthDay;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", birthDay=" + birthDay +
                '}';
    }
}
