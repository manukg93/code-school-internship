package edu.codeschool.training.classes_objects.homework4.client.TestClasses;
import edu.codeschool.training.classes_objects.homework4.client.Classes.Author;
import edu.codeschool.training.classes_objects.homework4.client.Classes.Book;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author (1, "Patrick Zuskind","manezak@gmail.com", "Masculin");
        Book book = new Book("Patrick Zuskind", author, 6500);
        System.out.println(author.toString());
        System.out.println(book.toString());
    }
}
