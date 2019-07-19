package edu.codeschool.training.classes_objects.homework4;
import edu.*;
public class Book {
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

    @Override
    public String toString() {
        return "Book [" + "name=" + name +",  Author [ name="+getAuthor().getAuthorName()+
                " , email=" + getAuthor().getEmail() +
                " , gender=" + getAuthor().getGender() +
                " , birthDate="+ getAuthor().getBirthDate()+
                "] , price=" + this.price+']';
    }
    //Book[name=?, Author [name=?,email=?, gender=?, birthDate=?], price=?]
}
