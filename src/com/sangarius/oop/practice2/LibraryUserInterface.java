package com.sangarius.oop.practice2;

import java.util.List;

public class LibraryUserInterface {

    private final LibraryService libraryService;

    public LibraryUserInterface(List<Book> books) {
        this.libraryService = new LibraryService(books);
    }

    private static void printBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("The books were not found.");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle() + " (" + book.getYear() + ")");
            }
        }
    }

    public void run() {
        printBooksByAuthor("Author1");
        printBooksByPublisher("Publisher1");
        printBooksPublishedAfterYear(2020);
    }

    private void printBooksByAuthor(String author) {
        System.out.println("List of books by a given author:");
        List<Book> booksByAuthor = libraryService.getBooksByAuthor(author);
        printBooks(booksByAuthor);
    }

    private void printBooksByPublisher(String publisher) {
        System.out.println("\nA list of books by a given publisher:");
        List<Book> booksByPublisher = libraryService.getBooksByPublisher(publisher);
        printBooks(booksByPublisher);
    }

    private void printBooksPublishedAfterYear(int year) {
        System.out.println("\nList of books published after 2020:");
        List<Book> booksPublishedAfterYear = libraryService.getBooksPublishedAfterYear(year);
        printBooks(booksPublishedAfterYear);
    }
}
