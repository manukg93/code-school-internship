package homework9.ex2;

import java.util.Date;

public final class User {
     private final String name;
     private final Address address;
     private final Date birthDay;

    public User(String name, Address address, Date birthDay) {
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
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
}
