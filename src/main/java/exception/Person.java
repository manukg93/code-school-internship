package exception;

public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeCannotBeNegativeException {
        if (age < 0) {
            AgeCannotBeNegativeException ex = new AgeCannotBeNegativeException("Age cannot be negatve");
            throw ex;
        }
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void validate() throws Exception {
        if (this.name == null || this.name.length() == 0) {
            throw new Exception("Invalid name");
        }
    }
}
