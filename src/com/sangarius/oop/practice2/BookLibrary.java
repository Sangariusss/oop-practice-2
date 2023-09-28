package com.sangarius.oop.practice2;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private BookLibrary() {

    }

    public static List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Author1", "Book1", "Publisher1", 2020, 300));
        books.add(new Book("Author2", "Book2", "Publisher2", 2018, 250));
        books.add(new Book("Author1", "Book3", "Publisher1", 2022, 350));
        books.add(new Book("Author3", "Book4", "Publisher3", 2019, 280));
        return books;
    }
}
