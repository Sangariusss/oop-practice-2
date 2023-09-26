package com.sangarius.oop.practice2;

import java.util.List;

public class PracticeRunner {

    public static void main(String[] args) {
        List<Book> books = BookLibrary.createBooks();
        LibraryUserInterface libraryUserInterface = new LibraryUserInterface(books);
        libraryUserInterface.run();
    }
}
