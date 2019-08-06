package homework9;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        City city = new City("Yerevan",200,500);
        City city1 = new City("Stpanakert",50,100);
        City[] cities = new City[2];
        cities[0]=new City("Abovyan",10,20);
        cities[1]=new City("Dilijan",20,40);
        Province[] provinces = new Province[2];
        provinces[0]=new Province("prov1",374,city,cities);
        provinces[1]= new Province("prov2",97,city1,cities);
        Country country = new Country("Armenia","hay",city,provinces);
        Country country1 = country.clone();
        System.out.println(country.getCapital()==country1.getCapital());


    }
}
