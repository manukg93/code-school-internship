package homework7.ex2;

import java.util.Arrays;

public class Company {
   private String name;
   private Address address;
   private Contact contact;
   private Department[] departments;

    public Company(String name, Address address, Contact contact, Department[] departments) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.departments = departments;
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
