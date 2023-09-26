package com.sangarius.oop.practice2;

public class Book {

    private final String author;
    private final String title;
    private final String publisher;
    private final int year;
    private final int pageCount;

    public Book(String author, String title, String publisher, int year, int pageCount) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPageCount() {
        return pageCount;
    }
}
