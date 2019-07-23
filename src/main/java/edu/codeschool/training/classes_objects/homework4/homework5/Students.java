package edu.codeschool.training.classes_objects.homework4.homework5;

public class Students extends Person {
    String university;
    double fee;

    public Students(String name, String address, String university, double fee) {
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
        return "Students{" +
                "university='" + university + '\'' +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
