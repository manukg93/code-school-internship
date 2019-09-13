package edu.codeschool.training.homework17.exercise3;

public class User {
    private String name;
    private int age;
    private String email;

    public User() {
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean equals(User user) {
        return this.age == user.getAge();
    }

    public int compareTo(User user) {
        if (this.getAge() > user.getAge()) {
            return 1;
        } else if(this.getAge() < user.getAge()){
            return -1;
        } else {
            return 0;
        }
    }

    public int compareToName(User user) {
        return this.getName().compareTo(user.getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
