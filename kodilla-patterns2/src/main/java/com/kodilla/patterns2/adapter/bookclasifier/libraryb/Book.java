package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final String signature;

    public Book(String title, String author, int publicationYear, String signature) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }
}
