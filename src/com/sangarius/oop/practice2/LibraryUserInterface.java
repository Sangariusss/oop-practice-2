package com.sangarius.oop.practice2;

import java.util.List;

public class LibraryUserInterface {

    private final LibraryService libraryService;

    public LibraryUserInterface(List<Book> books) {
        this.libraryService = new LibraryService(books);
    }

    public void run() {
        printBooksByAuthor("Author1");
        printBooksByPublisher("Publisher1");
        printBooksPublishedAfterYear(2020);
    }

    private void printBooksByAuthor(String author) {
        System.out.println("List of books by a given author:");
        List<Book> booksByAuthor = libraryService.getBooksByAuthor(author);
        BookLibrary.printBooks(booksByAuthor);
    }

    private void printBooksByPublisher(String publisher) {
        System.out.println("\nA list of books by a given publisher:");
        List<Book> booksByPublisher = libraryService.getBooksByPublisher(publisher);
        BookLibrary.printBooks(booksByPublisher);
    }

    private void printBooksPublishedAfterYear(int year) {
        System.out.println("\nList of books published after 2020:");
        List<Book> booksPublishedAfterYear = libraryService.getBooksPublishedAfterYear(year);
        BookLibrary.printBooks(booksPublishedAfterYear);
    }
}
