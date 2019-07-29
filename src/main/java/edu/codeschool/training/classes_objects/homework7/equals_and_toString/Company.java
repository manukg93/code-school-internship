package edu.codeschool.training.classes_objects.homework7.equals_and_toString;

public class Company {
    // fields
    String name;
    Address address;
    Department[] departments;
    Contact contact;

    // Constructors
    public Company() {
        this.name = "";
        this.address = new Address();
        this.contact = new Contact();
        this.departments = new Department[1];
    }

    public Company(String name, Address address) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }

        if (address != null) {
            this.address = address;
        } else {
            this.address = new Address();
        }
    }

    public Company(String name, Address address, int departmentsCount) {
        this(name, address);
        if (departmentsCount > 1) {
            this.departments = new Department[departmentsCount];
        }
    }

    // Setters
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public void setAddress(String country, String city, String street, long postalCode) {
        this.address = new Address(country, city, street, postalCode);
    }

    public void setContact(String email, String phoneNumber, String mobileNumber) {
        this.contact = new Contact(email, phoneNumber, mobileNumber);
    }

    public void setDepartments(int departmentsCount) {
        if (departmentsCount > 1) {
            this.departments = new Department[departmentsCount];
        }
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public Contact getContact() {
        return this.contact;
    }

    public Department[] getDepartments() {
        return this.departments;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        Company other = (Company) object;
        if (this.name == other.name) {
            if (this.address.equals(other.address)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Company: [Name: " + this.name + ", " + this.address.toString() + ", " + this.contact.toString() + "]";
    }
}
