package clone;

public class User implements Cloneable {
    String name;
    Address address;
    User(User user){
        this.name = user.name;
        this.address = new Address(user.address);
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        Address address = new Address(this.address.street);

        String name = this.name;



        User user = new User(name, address);
        return user;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("d", new Address("ss"));
        User clone = new User(user);

        System.out.println(user == clone);
        System.out.println(user.address == clone.address);
        System.out.println(user.address.street == clone.address.street);
        System.out.println(user.name == clone.name);
    }
}
