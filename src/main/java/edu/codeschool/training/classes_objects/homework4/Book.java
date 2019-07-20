package edu.codeschool.training.classes_objects.homework4;

public class Book  {
    private String name;
    private Author author;
    private double price;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){

        return "Book[name= " + "  " + this.name+ "  Author [name= " + getAuthor().getAuthorName()+"  "
                +" email= " +getAuthor().getEmail()+" "+ " Gender=  "+getAuthor().getGender()
               + "  "+"BirthDate=  " +getAuthor().getBirthDate()+ "] " +  "Price= "+price;




        //Book[name=?, Author [name=?,email=?, gender=?, birthDate=?], price=?]
    }
}
