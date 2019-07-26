package code.school.internship.classes_and_objects.homework.homework4;

public class Circle {
    private double radius=1.0;
    private String colour="red";
    public Circle(){}

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public String getColour(){
        return colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ",area='"+getArea()+'}';
    }
}