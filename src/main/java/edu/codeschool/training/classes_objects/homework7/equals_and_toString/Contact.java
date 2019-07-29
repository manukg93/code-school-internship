package edu.codeschool.training.classes_objects.homework7.equals_and_toString;

public class Contact {
    // fields
    String email;
    String phoneNumber;
    String mobileNumber;

    // Constructors
    public Contact() {
        this.email = "";
        this.phoneNumber = "";
        this.mobileNumber = "";
    }

    public Contact(String email, String phoneNumber, String mobileNumber) {
        if (email != null) {
            this.email = email;
        } else {
            this.email = "";
        }

        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "";
        }

        if (mobileNumber != null) {
            this.mobileNumber = mobileNumber;
        } else {
            this.mobileNumber = "";
        }
    }

    // Setters
    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        } else {
            this.email = "";
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "";
        }
    }

    public void setMobileNumber(String mobileNumber) {
        if (mobileNumber != null) {
            this.mobileNumber = mobileNumber;
        } else {
            this.mobileNumber = "";
        }
    }

    // Getters
    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        Contact other = (Contact) object;
        if (this.email == other.email) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Contact: [Email: " + this.email + " Phone number: " + this.phoneNumber + " Mobile: " + this.mobileNumber + "]";
    }
}
