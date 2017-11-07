package pl.training.refactoring;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Movies {

    private Map<String, Movie> moviesRepository = new HashMap<>();

    public void addCopy(String title) {
        Movie movie = getByTitle(title).orElse(new Movie(title));
        movie.addCopy();
        moviesRepository.put(title, movie);
    }

    private Optional<Movie> getByTitle(String title) {
        return Optional.ofNullable(moviesRepository.get(title));
    }

    public boolean rent(String title) {
        return getByTitle(title)
                .filter(Movie::rent)
                .isPresent();
    }

}
