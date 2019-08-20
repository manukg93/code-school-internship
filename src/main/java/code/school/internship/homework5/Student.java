package code.school.internship.homework5;

public class Student extends Person {
    String university;
    double fee;
    public Student(String name, String address,String university,double fee) {
        super(name, address);
        this.university = university;
        this.fee = fee;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university; 
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}
