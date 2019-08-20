package immutable;

public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void validate() throws Exception {
        if(this.name.length() == 0 ){
            throw new Exception("Invalid name");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("name");
        String originalName = person.getName();
        try{
            person.setName("");
            person.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            person.setName(originalName);
        }
        System.out.println(person);
    }
}
