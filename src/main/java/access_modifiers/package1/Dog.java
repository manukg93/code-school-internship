package access_modifiers.package1;

public class Dog {
    protected String name = "Rex";
    public int age;

    public void printName(){
        System.out.println(this.name);
    }

    public void printName(int age){
        System.out.println(name);
        System.out.println("Age " + age);
    }

    public void printName(String color){
        System.out.println(this.name);
        System.out.println("Color " + color);
    }

    @Override
    public String toString() {
        return "Name : " + this.name;
    }


    public class Nested{
        private String field;

        public void printNested(){
            System.out.println(this.field);
        }
    }
}



