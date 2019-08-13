package code.school.internship.homework4;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;
    float area;
    float perimeter;

    public Rectangle(float length, float width){

    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float calculateArea(){
        return area = length*width;
    }

    public float calculatePerimeter(){
        return perimeter = 2*(length + width);
    }

}
