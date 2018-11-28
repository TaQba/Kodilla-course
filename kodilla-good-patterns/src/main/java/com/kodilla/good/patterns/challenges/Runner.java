package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String args[]) {
        MovieStore theStore = new MovieStore();
        Map<String, List<String>> theMovieList = theStore.getMovies();
        System.out.println("# elements: " + theMovieList.size());
        List <String> theMovieTitles =  theMovieList.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toList());

        String theResultStringOfMovies = theMovieTitles.stream()
                .collect(Collectors.joining("!"));
        System.out.println(theResultStringOfMovies);
    }
}
