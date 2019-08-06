package code.school.internship.classes_and_objects.homework.homework9;

 this.cities = cities;
         }

public String getName() {
        return name;
        }

public long getMobileCode() {
        return mobileCode;
        }

public City getCenterCity() {
        return centerCity;
        }

public City[] getCities() {
        return cities;
        }

@Override
protected Province clone() throws CloneNotSupportedException {
        return (Province) super.clone();
