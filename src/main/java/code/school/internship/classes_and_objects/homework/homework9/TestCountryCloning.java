package code.school.internship.classes_and_objects.homework.homework9;



//import edu.codeschool.training.homework9.City;
//import edu.codeschool.training.homework9.Country;
//import edu.codeschool.training.homework9.Province;

public class TestCountryCloning {
 public static void main(String[] args) throws CloneNotSupportedException {
  // Test Country class
  Country ourCountry = new Country(3);
  ourCountry.setName("Armenia");
  ourCountry.setCapital("Yerevan");
  ourCountry.setNationality("armenian");
  ourCountry.setNumberOfProvinces(3);

  Province [] provinces = ourCountry.getProvinces();
  provinces[0] = new Province("Armavir");
  provinces[1] = new Province("Syuniq");
  provinces[2] = new Province("Vayots Dzor");

  System.out.println(ourCountry);

  // clone ourCountry object
  Country nextCountry = ourCountry.clone();

  System.out.println();

  nextCountry.setName("Georgia");
  nextCountry.setCapital("Tbilisi");
  nextCountry.setNationality("georgian");
  Province[] neibourProvinces = nextCountry.getProvinces();
  neibourProvinces[0] = new Province("AAA");
  neibourProvinces[1] = new Province("BBB");
  neibourProvinces[2] = new Province("CCC");

  System.out.println(nextCountry);

  // copy ourCountry object using copy constructor
  Country russia = new Country(ourCountry);

  System.out.println();
  System.out.println("Russia");
  russia.setName("Russia");
  russia.setNationality("russian");
  russia.setCapital("Moscow");
  Province[] russiaProvinces = russia.getProvinces();
  russiaProvinces[0] = new Province("Kray1");
  russiaProvinces[1] = new Province("Kray2");
  russiaProvinces[0] = new Province("Kray3");

  System.out.println(russia);


 }
}