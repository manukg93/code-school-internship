package edu.codeschool.training.classes_objects.homework4.client.Classes;

public class Book {
    private String name;
    private Author author;
    private double price;
    public Book(String name, Author author, double price){
        this.name=name;
        this.author=author;
        if (price < 0 ) {
            System.out.println("Incorrect price value : ");
            this.price = 0;
            return;
        }
        this.price=price;
    }

    // setter and getter
    public void setName(String name) { this.name = name; }
    public void setAuthor(Author author) { this.author = author;}
    public void setPrice(int price) {
        if(price < 0)
        { System.out.println("Incorrect price value: ");
        this.price=0;
        return;
        }
        this.price=price;
    }
    public String getName() { return name; }
    public Author getAuthor() {
        Author author = this.author;
        return author; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Name: " + name + " Information: " + author.toString() + " Price: "+ price;
   }
}
