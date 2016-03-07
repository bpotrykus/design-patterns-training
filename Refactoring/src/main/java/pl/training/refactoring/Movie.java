package pl.training.refactoring;

public class Movie {

    private String title;
    private int copies;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addCopy() {
        copies++;
    }

    public void removeCopy() {
        copies--;
    }

    public int getCopies() {
        return copies;
    }

}
