package pl.training.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MovieTest {

    private Movie movie = new Movie("W pustyni i w puszczy");

    @Test
    public void shouldCalculateRegularMovieCost() {
        int daysRented = 6;
        int expectedResult = 8;
        assertTrue(movie.getRentCosts(daysRented) == expectedResult);
    }

    @Test
    public void shouldCalculateNewReleaseMovieCost() {
        int daysRented = 6;
        int expectedResult = 18;
        movie.setGender(Gender.NEW_RELEASE);
        assertTrue(movie.getRentCosts(daysRented) == expectedResult);
    }

    @Test
    public void shouldCalculateChildrenMovieCost() {
        int daysRented = 6;
        int expectedResult = 6;
        movie.setGender(Gender.CHILDREN);
        assertTrue(movie.getRentCosts(daysRented) == expectedResult);
    }

}
