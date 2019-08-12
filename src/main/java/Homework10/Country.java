package Homework10;

public class Country {
    String name;
    String nationality;
    City capital;
    Province[] province;
Country() {
this.name="Mane Zakaryan";
this.nationality="Armenian";
 this.capital=null;
 this.province=null;
}
Country(String name, String nationality, City City, Province[] province){
    this.nationality=nationality;
    this.name=name;
    this.capital=capital;
    this.province=province;
}
    public String getName() { return name; }
    public String getNationality(){return nationality;}
    public City getCapital(){ return capital;}
    public Province[] getProvince() { return province; }
    public void setName(String name){ this.name=name;}
    public void setNationality(String nationality){ this.nationality=nationality;}
    public void setCapital(City capital){this.capital=capital;}
    public void setProvince(Province[] province){this.province=province;}

    @Override
    public String toString() {
        return name + " " + nationality + " " + capital + " " + province;
    }

}
