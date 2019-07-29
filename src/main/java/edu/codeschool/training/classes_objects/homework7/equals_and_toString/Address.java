package edu.codeschool.training.classes_objects.homework7.equals_and_toString;

public class Address {
    // fields
    String country;
    String city;
    String street;
    long postalCode;

    // Constructors
    public Address() {
        this.country = "Republic of Armenia";
        this.city = "Yerevan";
        this.street = "Mashtoc Avenue";
        this.postalCode = 0;
    }

    public Address(String country, String city, String street, long postalCode) {
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Republic of Armenia";
        }

        if (city != null) {
            this.city = city;
        } else {
            this.city = "Yerevan";
        }

        if (street != null) {
            this.street = street;
        } else {
            this.street = "Mashtoc Avenue";
        }

        if (postalCode > 0) {
            this.postalCode = postalCode;
        } else {
            this.postalCode = 0;
        }
    }

    // Setters
    public void setCountry(String country) {
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Republic of Armenia";
        }
    }

    public void setCity(String city) {
            if (city != null) {
                this.city = city;
            } else {
                this.city = "Yerevan";
            }
    }

    public void setStreet(String street) {
            if (street != null) {
                this.street = street;
            } else {
                this.street = "Mashtoc Avenue";
            }
    }

    public void setPostalCode(long postalCode) {
        if (postalCode > 0) {
            this.postalCode = postalCode;
        } else {
            this.postalCode = 0;
        }
    }

    // Getters
    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        Address other = (Address) object;

        if ((this.country == other.country) && (this.postalCode == other.postalCode)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Address: [country: " + this.country + ", city: " + this.city + ", street: " + this.street
                + ", postal code: " + this.postalCode + "]";
    }


}
