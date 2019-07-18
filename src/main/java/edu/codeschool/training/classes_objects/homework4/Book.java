package edu.codeschool.training.classes_objects.homework4;

import edu.codeschool.training.classes_objects.homework4.Author;

public class Book {
    private String name;
    private Author author;
    private double price;

    //Constructors
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;

        if (price < 0) {
            System.out.println("Price should be positiv value");
            this.price = 0;
            return;
        }
        this.price = price;
    }

    //Setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price should be positiv value");
            this.price = 0;
            return;
        }
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author.getAuthorName();
    }

    public double getPrice() {
        return price;
    }

    //Public methods
    public String toString() {
        String bookNameFull = "Book: [Name: " + this.name + ", " + this.author.toString() + ", Price: " + this.price + " ]";
        return bookNameFull;
    }
}
