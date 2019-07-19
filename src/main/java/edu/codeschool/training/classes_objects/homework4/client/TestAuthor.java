package edu.codeschool.training.classes_objects.homework4.client;
import edu.codeschool.training.classes_objects.homework4.*;
public class TestAuthor {
    public static void main(String[] args) {
     //   Inside main method create object of type Book.
     //   Print the object to console.
        //          Print the name of the author of the book to console.
        Author author=new Author(1234,"Hayk","hayk.serobyan.89@mail.ru","male");
        Book book= new Book("JAVA",author,2300);
        System.out.println(book);
    }
}
