package Homework10;
import java.util.Date;

public final class User implements Cloneable {
    final String name;
    final AdressClass adress;
    final Date birthday;
    public User( String name, String street, String cityClassName, Date birthday){
        this.name = name;
        this.adress = new AdressClass(street, cityClassName);
        this.birthday = birthday;
    }
    public User(String name, AdressClass address, Date birthday) {
        this.name = name;
        this.adress = address;
        this.birthday = birthday;
    }

    public User(String mane, String street, String cityClassName, Date birthday, String name, AdressClass adress, Date birthday1) {
        this.name = name;
        this.adress = adress;
        this.birthday = birthday1;
    }
    public String getName () {
        return this.name;
    }
    public AdressClass getAdress () {
        return this.adress;
    }
    public Date getdate() {
        return this.birthday;
    }
    @Override
    public String toString() {
        return this.name + " " + this.adress.toString() + " " + this.birthday.toString();
    }
    @Override
    public User clone() throws CloneNotSupportedException{
        return (User) super.clone();
    }
}
