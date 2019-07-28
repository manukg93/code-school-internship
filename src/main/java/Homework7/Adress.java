package Homework7;

public class Adress {
    String country;
    String city;
    String street;
    long CP;
    public Adress(String country, String city, String street, long CP ){
        this.country=country;
        this.city=city;
        this.street=street;
        this.CP=CP;
    }
    public String getCountry(){ return country; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public long getCP() { return CP; }
    public void setCountry(String givenCountry) { this.country = givenCountry;}
    public void setCity(String givenCity) { this.city = givenCity; }
    public void setStreet(String givenStreet) { this.street = givenStreet; }
    public void setCP(long givenCP) { this.CP = givenCP; }

    @Override
    public String toString() {
        return country + " " + city + " " + street + " " + CP;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
