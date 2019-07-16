package code.school.internship.classes_and_objects.polymorphism;

class MotorBike extends Vehicle{

    public void move(){

    System.out.println("MotorBike can move and accelerate too!!");

    }

    public static void main(String[] args) {
        int a = 10;
        if (++a <= 10){
            System.out.println("aaa");
            System.out.println(a);
        }
    }

}