package immutable;

public final class Human {
    private final String name;
    private final int age ;
    private final Address address;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        Address address1 = new Address(address.getStreet(),address.getCity());
        return address1;
    }

    public Human() {
        this.name = "";
        this.age = 5;
        this.address = null;
    }

    public Human(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        Address address1 = new Address(address.getStreet(),address.getCity());
        this.address = address1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
