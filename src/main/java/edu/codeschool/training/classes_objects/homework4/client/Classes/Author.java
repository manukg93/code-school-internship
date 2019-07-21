package edu.codeschool.training.classes_objects.homework4.client.Classes;
import edu.codeschool.training.classes_objects.homework4.client.Date;

public class Author {
    private int id;
    private String name;
    private String email;
    private Date birthDate;
    private String gender;

    Date date = new Date (13,01,1994);

    public Author(int id, String name, String email, String gender){
        this.id=id;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public int getid(){ return id; }
    public void setid() { this.id=id; }
    public String getname() { return name;}
    public void setname() { this.name=name; }
    public String email() { return email; }
    public void setemail() { this.email=email; }
    public String gender() { return gender; }
    public void setgender() { this.gender=gender; }
    public String AuthorName() { return name;}

   public Author getAuthorName() { return this;}

    @Override
    public String toString() {
        return "Name: " + name + " Email: " + email + " Date: " + date + " Gender: " + gender;
    }
}
