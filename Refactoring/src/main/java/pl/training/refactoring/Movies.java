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

    public boolean rent(String title) {
        if (!isAvailable(title)) {
            return false;
        }
        get(title).removeCopy();
        return true;
    }

    private Movie get(String title) {
        return moviesRepository.getOrDefault(title, new Movie(title));
    }

    private boolean isAvailable(String title) {
        return getNumberOfCopies(title) > 0;
    }

    private int getNumberOfCopies(String title) {
        return get(title).getCopies();
    }

}
