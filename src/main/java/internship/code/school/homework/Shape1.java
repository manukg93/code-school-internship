package internship.code.school.homework;

public abstract class Shape1 {
    protected String shapeName;

    public Shape1(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract void area();

    @Override
    public String toString() {
        return "Shape1{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
