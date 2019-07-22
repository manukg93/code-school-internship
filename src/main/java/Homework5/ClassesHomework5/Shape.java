package Homework5.ClassesHomework5;

public class Shape {
    public String color;
    public boolean filled;
    public Shape(){
        color = "green";
        filled = true;
    }
    public Shape(String color, boolean filled){
        if (color!=null) {
            this.color = color;
        }
        this.filled=filled;
    }
    public String getColor() { return color; }
    public boolean getFilled() { return filled; }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String result;
        if (filled) {
            result = "A shape with color of " + color + " filled";
        } else {
            result ="A shape with color of " + color + " not filled";
        }
        return result;
    }

}
