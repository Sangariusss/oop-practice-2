package com.sangarius.oop.practice2;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private final List<Book> books;

    public LibraryService(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getBooksByPublisher(String publisher) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getBooksPublishedAfterYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                result.add(book);
            }
        }
        return result;
    }
}
