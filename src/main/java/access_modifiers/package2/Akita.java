package access_modifiers.package2;

public class Akita extends access_modifiers.package1.Dog{

    protected void printAkitaName(){
        this.printName();
        System.out.println(this.name);
    }
}
