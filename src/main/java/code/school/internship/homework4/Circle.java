package code.school.internship.homework4;

public class Circle {
   private double radius = 1;
   private String color = "red";
   private double area;

    public Circle(){

    }
    public Circle(double radius){

    }
    public Circle(double radius, String color){

    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return area;
    }

    }

