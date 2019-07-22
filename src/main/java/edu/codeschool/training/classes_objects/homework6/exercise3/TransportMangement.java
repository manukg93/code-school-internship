package edu.codeschool.training.classes_objects.homework6.exercise3;

public class TransportMangement {
    public static void main(String[] args) {
        Car truck=new Car("Volvo","Black",150.6);
        Car bus=new Car("Bogdan","Yellow",120.8);
        Train tram=new Train("Tram","Grey",50.6);
        Train innerCity =new Train("InnerCity","Green",40.2);
        System.out.println(truck.infoCar()+" "+truck.getName()+truck.infoType());
        System.out.println(bus.infoCar()+" "+bus.getName()+bus.infoType());
        tram.infoTrain();
        System.out.print(tram.getName()+ " ");
        tram.infoType();
        innerCity.infoTrain();
        System.out.print(innerCity.getName()+ " ");
        innerCity.infoType();


    }
}
