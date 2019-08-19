package code.school.internship.homework4;
import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date birthDate = new Date();
    private static int number;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        number++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public void numberObj () {

        System.out.println(number);

}



}
