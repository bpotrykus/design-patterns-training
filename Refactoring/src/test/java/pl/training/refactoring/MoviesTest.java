package pl.training.refactoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MoviesTest {

    private Movies movies = new Movies();
    private String title = "W pustyni i w puszczy";

    @Before
    public void init() {
        movies.add(title);
    }

    @Test
    public void movieShouldBeRentedIfAvailable() {
        assertTrue(movies.rent(title));
    }

}
