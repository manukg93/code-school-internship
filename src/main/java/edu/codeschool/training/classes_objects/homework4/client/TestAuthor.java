package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Author;
import edu.codeschool.training.classes_objects.homework4.Book;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Bjarne Stroustrup", "aaa@gmail.com", "Male");
        author.setBirthDate(30, 12, 1950);
        Book book = new Book("The C++ Programming Language", author, 50);
        System.out.println(book.toString());
        System.out.println(author.toString());
    }
}
