package code.school.internship.classes_and_objects.homework;

public class SubStudent extends Person {
    public String university;
    public double fee;

    // Constructors
    public SubStudent(String name, String address, String university, double fee) {
        super(name, address);
        if (university != null) {
            this.university = university;
        }

        if (fee < 0) {
            System.out.println("University fee must be positive value.");
            this.fee = 0;
            return;
        }
        this.fee = fee;
    }

    // Getters and setters
    public void setUniversity(String university) {
        if (university != null) {
            this.university = university;
        }
    }
    public String getUniversity() {
        return university;
    }

    public void setFee(double fee) {
        if (fee < 0) {
            System.out.println("University fee must be positive vaule.");
            this.fee = 0;
            return;
        }
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        String studentInformation = "Student: " + super.toString() + " University:" + university + ", University Fee:" + fee + "]";
        return studentInformation;
    }
}