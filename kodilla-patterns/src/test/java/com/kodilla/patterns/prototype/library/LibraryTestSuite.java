package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library1 = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library1.getBooks().add(new Book("Title" + n, "Author" + n, LocalDate.now())));

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedBoard = null;
        try {
            deepClonedBoard = library1.deepCopy();
            deepClonedBoard.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library1.getBooks().clear();
        //Then
        Assert.assertEquals(0, library1.getBooks().size());
        Assert.assertEquals(0, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedBoard.getBooks().size());
    }
}
