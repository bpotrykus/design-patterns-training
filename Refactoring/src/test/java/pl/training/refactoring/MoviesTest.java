package pl.training.refactoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoviesTest {

    private Movies movies = new Movies();
    private  Rentals rentals = new Rentals(movies);
    private String title = "W pustyni i w puszczy";

    @Before
    public void init() {
        movies.add(title);
    }

    @Test
    public void movieShouldBeAvailableAfterAdding() {
        assertTrue(movies.isAvailable(title));
    }

    @Test
    public void movieShouldNotBeAvailableWhenIsNoCopyLeft() {
        assertFalse(movies.isAvailable("Terminator"));
    }

    @Test
    public void movieRentalShouldDecreaseAvailableMovieCopies() {
        int expectedNumberOfCopies = movies.getNumberOfCopies(title) - 1;
        rentals.rent(title);
        assertTrue(movies.getNumberOfCopies(title) == expectedNumberOfCopies);
    }

    @Test
    public void movieAddShouldIncreaseAvailableMovieCopies() {
        int expectedNumberOfCopies = movies.getNumberOfCopies(title) + 1;
        movies.add(title);
        assertTrue(movies.getNumberOfCopies(title) == expectedNumberOfCopies);
    }

}
