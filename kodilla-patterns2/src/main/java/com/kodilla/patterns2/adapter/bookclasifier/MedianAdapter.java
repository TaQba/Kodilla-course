package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {

        HashMap<BookSignature, Book> mapBooks = new HashMap<>();

        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book oldBook:
        bookSet) {
            BookSignature signature = new BookSignature(oldBook.getSignature());
            Book newBook = new Book(oldBook.getTitle(), oldBook.getAuthor(), oldBook.getPublicationYear());
            mapBooks.put(signature, newBook);
        }

        return medianPublicationYear(mapBooks);
    }
}
