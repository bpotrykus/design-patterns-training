package pl.training.refactoring;

import java.util.HashMap;
import java.util.Map;

public class Movies {

    private Map<String, Movie> moviesRepository = new HashMap<>();

    public void add(String title) {
        Movie movie = get(title);
        movie.addCopy();
        moviesRepository.put(movie.getTitle(), movie);
    }

    public Movie get(String title) {
        return moviesRepository.getOrDefault(title, new Movie(title));
    }

    public void remove(String title) {
        get(title).removeCopy();
    }

    public boolean isAvailable(String title) {
        return getNumberOfCopies(title) > 0;
    }

    public int getNumberOfCopies(String title) {
        return get(title).getCopies();
    }

}
