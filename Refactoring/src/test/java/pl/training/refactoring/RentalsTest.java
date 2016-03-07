package pl.training.refactoring;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class RentalsTest {

    @Mock
    private Movies movies;
    private Rentals rentals;
    private String title = "W pustyni i w puszczy";

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        rentals = new Rentals(movies);
    }

    @Test
    public void movieRentalShouldDecreaseAvailableMovieCopies() {
        rentals.rent(title);
        verify(movies).remove(title);
    }

}
