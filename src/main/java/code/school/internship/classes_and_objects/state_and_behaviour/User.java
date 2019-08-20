package code.school.internship.classes_and_objects.state_and_behaviour;

import java.util.Objects;

public class User {
    private String name;
    private int age = 20;

    class Student {
        private String univercity;

        public Student(String univercity) {
            this.univercity = univercity;
        }

        public String getUnivercity() {
            System.out.println(name);
            return univercity;
        }

        public void setUnivercity(String univercity) {
            this.univercity = univercity;
        }
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        Student student = new Student("USA");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//        if (obj == null){
//            return false;
//        }
//
//        if (this.getClass() == obj.getClass()){
//
//        }
//
//        if (obj instanceof User){
//            User user = (User)obj;
//            if(this.name.equals(user.name) && this.age == user.age){
//                return true;
//            }else {return false;}
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
