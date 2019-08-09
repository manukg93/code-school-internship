package Homework10;

public class AdressClass {
        String street;
        City city;
        public AdressClass() {
            this.street = "street";
            this.city = new City();
        }
        public AdressClass(String street, String cityName) {
            if (street != null) {
                this.street = street;
            }
            if (cityName != null) {
                this.city = new City(cityName);
            }
        }
        public AdressClass(String street, City city) {
            if (street != null) {
                this.street = street;
            }
            if (city != null) {
                this.city = city;
            }
        }
        public void setStreet(String street) {
            if (street != null) {
                this.street = street;
            }
        }
        public void setCity(City city) {
            if (city != null) {
                this.city = city;
            }
        }
        public void setCity(String name) {
            if (name != null) {
                this.city = new City(name);
            }
        }
        public String getStreet() {
            return this.street;
        }
        public City getCity() {
            return this.city;
        }
        @Override
        public String toString() {
            return  street + " / " + city.toString();
        }
    }
