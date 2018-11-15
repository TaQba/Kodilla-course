package com.kodilla.stream.beautifie;

import com.kodilla.stream.beautifier.*;
import org.junit.Assert;
import org.junit.Test;
import java.lang.*;
public class PoemBeautifierTestSuite {

    @Test
    public void shouldReturnUpperCaseText (){
        //Given
        PoemBeautifier poem = new PoemBeautifier();
        //When
        String result = poem.beautify("test1", String::toUpperCase);
        //Then
        Assert.assertEquals("TEST1", result);
    }

    @Test
    public void shouldReturnLowerCaseText (){
        //Given
        PoemBeautifier poem = new PoemBeautifier();
        //When
        String result = poem.beautify("TEST2", String::toLowerCase);
        //Then
        Assert.assertEquals("test2", result);
    }

}
