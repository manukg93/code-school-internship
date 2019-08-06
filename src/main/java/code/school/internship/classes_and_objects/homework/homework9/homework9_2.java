package code.school.internship.classes_and_objects.homework.homework9;

        this.provinces = provinces;
                }

public String getName() {
        return name;
        }

public String getNationality() {
        return nationality;
        }

public City getCapital() {
        return capital;
        }

public Province[] getProvinces() {
        return provinces;
        }

@Override
protected Country clone() throws CloneNotSupportedException {
        return (Country) super.clone();
        Country newCountry=(Country)super.clone();
        newCountry.capital=capital.clone();
        newCountry.provinces=provinces.clone();
        return newCountry;
        }

@Override
