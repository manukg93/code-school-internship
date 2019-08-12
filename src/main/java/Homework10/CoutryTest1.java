package Homework10;

public class CoutryTest1 {
        public static void main(String[] args) throws CloneNotSupportedException {
//            System.out.println("This is a Shallow copy example");
//            Province province1 = new Province();
//            province1.name = "Arnaud";
//            province1.mobileCode=156;
//            province1.centreCity=null;
//            province1.cities=null;
//            province1.country.name="Aix en provance";
//            province1.country.nationality="French";
//            Province province2 = (Province)province1.clone();
//            System.out.println(province1.name + " " + province1.mobileCode + " " + province1.country.name +
//                    " " + province1.country.nationality);
//            System.out.println(province2.name + " " + province2.mobileCode + " " + province2.country.name +
//                    " " + province2.country.nationality);

            System.out.println("This is a deep copy example");

            Province province3 = new Province();
            province3.name = "Vahe";
            province3.mobileCode=145600;
            province3.centreCity=null;
            province3.cities=null;
            province3.country.name="Yerevan";
            province3.country.nationality="Armenian";

            System.out.println( province3.name + " " +
                    province3.mobileCode + " " +
                    province3.country.name + " " +
                    province3.country.nationality);

            Province province4 = (Province)province3.clone();
            province4.name = "Zareh";
            province4.mobileCode=14560066;
            province4.centreCity=null;
            province4.cities=null;
            province4.country.name="Hrazdan";
            province4.country.nationality="ARMENIA";



            System.out.println(province4.name + " " +
            province4.mobileCode + " " +
            province4.country.name + " " +
            province4.country.nationality);
        }
    }

