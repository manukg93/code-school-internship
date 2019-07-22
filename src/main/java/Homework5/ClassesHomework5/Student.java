package Homework5.ClassesHomework5;

public class Student {
    static int numberOfObjects=0;
    private String name;
    private int age;
    private int birthDate;
    public Student(String name, int age, int birthDate){
        this.name=name;
        if (age > 0) {
            this.age = age;
        }
        if (birthDate > 0) {
            this.birthDate = birthDate;
        }
    }
    public String getName(){ return name; }
    public int getAge() { return age; }
    public int getBirthDate() { return birthDate; }
    public void setName(String givenName) { this.name=givenName; }
    public void setAge(int givenAge) {
        if (age < 0) {
            System.out.println("Incorrect input of age: ");
        } else { this.age = age; }
    }
    public void setBirthDate (int givenBirthDate) { this.birthDate=givenBirthDate; }

    public static int getNumberOfObjects() {
        return numberOfObjects +=1;
    }

    @Override
    public String toString() {
        return name + " - "+ age + " - " + birthDate;
    }
}
