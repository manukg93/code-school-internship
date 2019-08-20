package inner_nested_classes;

import java.util.Objects;

public class User {
    private String name;
    private int age = 20;

    static class Student {
        private String univercity;

        public Student(String univercity) {
            this.univercity = univercity;
        }

        public String getUnivercity() {
            System.out.println();
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
        class SimpleName {
            private String simpleName;

            public SimpleName(String simpleName) {
                this.simpleName = simpleName;
            }

            public String getSimpleName() {
                return simpleName;
            }

            public void setSimpleName(String simpleName) {
                this.simpleName = simpleName;
            }
        }

        SimpleName simpleName = new SimpleName(name);
        return simpleName.getSimpleName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        Student student = new Student("");
        name = "Arthur";
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
