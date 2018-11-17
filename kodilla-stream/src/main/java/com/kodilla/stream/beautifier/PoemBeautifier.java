package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemDecorator;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator decorator) {
        String result = decorator.decorate(text);
        System.out.println("Poem beautified: " + result);
        return result;
    }
}
