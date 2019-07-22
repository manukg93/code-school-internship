package Homework5.ClassesHomework5;

public class StudentPerson extends Person {
    String university;
    double fee;
    public StudentPerson(String name, String adress, String university, int fee) {
        this.name = name;
        this.adress = adress;
        this.university = university;
        this.fee = fee;
    }
    public double getFee() { return fee; }
    public String getUniversity() { return university; }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + " Name of university: " + university + " Annual fee: " + fee;
    }
}
