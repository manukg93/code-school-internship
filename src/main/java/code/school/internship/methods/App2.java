package code.school.internship.methods;

class MethodsDemo {


    float area(double radius) {
        final float pi = 3.14f;
        float val;
        val = pi * (float) (radius * radius);
        return val;
    }
}



public class App2{
    public static void main(String[] args) {
      MethodsDemo demo = new MethodsDemo();
      float area = demo.area(5);

      System.out.println(area);
    }
}