package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.homework6.Author;
import edu.codeschool.training.classes_objects.homework4.homework6.Book;

public class  TestAuthor  {
    public static void main(String[] args) {
        Author author=new Author(222, "Hamo", "Hmosargsyan888@gmail.com", "Male" );
        Book book=new Book("OOP", author, 500);
        System.out.println(book);

    }
}
