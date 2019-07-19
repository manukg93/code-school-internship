package internship.code.school.homework;

public class Student1 extends Person {
    private String university;
    private double fee;


    public Student1(String name, String address, String university, double fee) {
        super(name, address);
        this.university = university;
        this.fee = fee;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student1{" +
                "university='" + university + '\'' +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
