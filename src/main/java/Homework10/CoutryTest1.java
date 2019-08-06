package Homework10;

public class CoutryTest1 {
        public static void main(String[] args) throws CloneNotSupportedException {
            Province province1 = new Province();
            province1.name = "Arnaud";
            province1.mobileCode=156;
            province1.centreCity=null;
            province1.cities=null;
            province1.country.name="Aix en provance";
            province1.country.nationality="French";
            Province province2 = (Province)province1.clone();
            System.out.println(province1.name + " " + province1.mobileCode + " " + province1.country.name +
                    " " + province1.country.nationality);
            System.out.println(province2.name + " " + province2.mobileCode + " " + province2.country.name +
                    " " + province2.country.nationality);
        }
    }

