package edu.codeschool.training.classes_objects.homework_17_Collection;

public class User implements Comparable<User> {
    private String name;
    private int age;
    private String email;

    public User() {
        this.name = "Hayk";
        this.age = 30;
        this.email = "hayk.serobyan.89@mail.ru";
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name+"-"+this.age+"-"+this.email;
    }


    @Override
    public int compareTo(User o) {
        if (o.getAge() != this.getAge()) {
            if (o.getAge()< this.getAge()) {
                return o.getAge()- this.getAge();
            } else {
                return o.getAge()- this.getAge();
            }
        }else return 0;
    }
}
