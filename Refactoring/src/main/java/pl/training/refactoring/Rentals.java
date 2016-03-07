package pl.training.refactoring;

public class Rentals {

    private Movies movies;

    public Rentals(Movies movies) {
        this.movies = movies;
    }

    public void rent(String title) {
        movies.remove(title);
    }

}
