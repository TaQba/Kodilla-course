package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book b1 = new Book("Title1","Autor1", 1980,"Sig1");
        Book b2 = new Book("Title2","Autor2", 1990,"Sig2");
        Book b3 = new Book("Title3","Autor3", 1995,"Sig3");
        Book b4 = new Book("Title4","Autor4", 1997,"Sig4");
        Book b5 = new Book("Title5","Autor5", 2001,"Sig5");


        HashSet<Book> bookSet = new HashSet<Book>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        bookSet.add(b5);
        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(median, 1995);
    }
}
