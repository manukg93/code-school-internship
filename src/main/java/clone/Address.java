package clone;

public class Address implements Cloneable{
    String street;

    public Address(Address address){
        this.street = address.street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address(String street) {
        this.street = street;
    }
}
