package org.example;

import org.example.classes.examples.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Frank Herbert", "Diuna", 10, 4);
        Book book3 = new Book("Frank Herbert", "Diuna", 10, 5);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("Book1 == Book3: " + book1.equals(book3));
        System.out.println("Book2 == Book3: " + book2.equals(book3));
        book3.reduceBookCount(1);
        System.out.println("Book2 == Book3 after reduce: " + book2.equals(book3));
\
        book1.setPrice(1);
        System.out.println(book1);

        System.out.println(Book.getObjectsCount());

        try {
            Book book = new Book("Sapkowski", "Wiedźmin", 2, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}