package code.school.internship.classes_and_objects.state_and_behaviour;


// public
//private
// protected
//package private















class Country  {
    int population = 80;
    float currencyRate;
    int noOfStates;


    Country(int population)
    {
        System.out.println("Int parameter");
        this.population = population;
    }

    Country(float population){
        System.out.println("Float parameter");
        this.population = (int)population;
    }

    Country(int population,float currencyRate)
    {
        this.population = population;
        this.currencyRate = currencyRate;
    }

    public String toString(){
        return "Country object " + "Population = " + this.population + " CurrencyRate " + this.currencyRate;
    }

}

public class App1 {
    public static void main(String[] args) {
//        Country japan = new Country(20,2);
//        Country china = new Country(60,2);
        Country china1 = new Country(2f);
        china1.currencyRate = 1;

//        System.out.println(japan.toString());
//        System.out.println(china.population);
//        System.out.println(china.currencyRate);
    }
}
