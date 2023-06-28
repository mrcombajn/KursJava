package org.example.classes.examples;

import lombok.Getter;

import java.math.BigDecimal;

public class Book {

    @Getter
    private static long objectsCount;

    @Getter
    private final String author;
    private final String title;

    @Getter
    private BigDecimal price;
    private long quantity;

    public Book() {
        this.author = "No author";
        this.title = "No title";
        this.price = BigDecimal.ZERO;
        this.quantity = 0;
        objectsCount++;
    }

    public Book (String author, String title, int price, int quantity) {
        this.author = author;
        this.title = title;
        this.price = new BigDecimal(price);
        this.quantity = quantity;

        if (price < 0)
            this.price = BigDecimal.ZERO;
        if (quantity < 0)
            this.quantity = 0;

        objectsCount++;
    }

    public void setPrice(int price) {
        if (price >= 5)
            this.price = new BigDecimal(price);
    }

    public void reduceBookCount(int quantity) {
        if (quantity > this.quantity) {
            System.out.println("Cannot reduce book number.");
            return;
        }
        this.quantity -= quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if(obj == this)
            return true;

        try {
            Book book = (Book)obj;

            return this.author.equals(book.author) &&
                    this.title.equals(title) &&
                    this.price.equals(book.price) &&
                    this.quantity == book.quantity;

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "author=" + author + '\n' +
                "title=" + title + '\n' +
                "price=" + price + '\n' +
                "quantity=" + quantity + '\n';
    }

}
