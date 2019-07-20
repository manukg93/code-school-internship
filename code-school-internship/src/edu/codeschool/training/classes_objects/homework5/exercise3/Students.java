package edu.codeschool.training.classes_objects.homework5.exercise3;

public class Students extends Person {
    private String university;
    private double fee;

//    public Student(){
//    };

    public Students(String name, String address, String university, double fee) {
        this.setName(name);
        this.setAddress(address);
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
        return "Name: " + this.getName() + ", Address: " + super.getAddress() + ", University: "
                + this.university + ", Fee: " + this.fee;
    }
}
