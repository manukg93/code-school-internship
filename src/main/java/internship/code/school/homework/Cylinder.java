package internship.code.school.homework;

public class Cylinder extends Shape1 {
    private double radius;
    private double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println(Math.PI*height*Math.pow(radius,2));
    }

}
