package ru.netology.manager.mockito.manager;

import jdk.jfr.Experimental;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    Afisha afisha = new Afisha();

    @Test

    public void addedMovies() {
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");
        afisha.addMovie("Movie4");
        afisha.addMovie("Movie5");
        afisha.addMovie("Movie6");
        afisha.addMovie("Movie7");
        afisha.addMovie("Movie8");
        afisha.addMovie("Movie9");
        afisha.addMovie("Movie10");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast() {
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");
        afisha.addMovie("Movie4");
        afisha.addMovie("Movie5");
        afisha.addMovie("Movie6");
        afisha.addMovie("Movie7");
        afisha.addMovie("Movie8");
        afisha.addMovie("Movie9");
        afisha.addMovie("Movie10");

        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastBelowLimit() {
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");
        afisha.addMovie("Movie4");
        afisha.addMovie("Movie5");
        afisha.addMovie("Movie6");
        afisha.addMovie("Movie7");
        afisha.addMovie("Movie8");
        afisha.addMovie("Movie9");

        String[] expected = {"Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastAboveLimit() {
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");
        afisha.addMovie("Movie4");
        afisha.addMovie("Movie5");
        afisha.addMovie("Movie6");
        afisha.addMovie("Movie7");
        afisha.addMovie("Movie8");
        afisha.addMovie("Movie9");
        afisha.addMovie("Movie10");
        afisha.addMovie("Movie11");

        String[] expected = {"Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
