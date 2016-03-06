package pl.training.refactoring;

public class Movie {

    public static enum Category {REGULAR, NEW_RELEASE, CHILDREN}
    private static final Category BONUS_CATEGORY = Category.NEW_RELEASE;

    private String title;
    private Category category;

    public Movie(String title, Category category) {
        this.title = title;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public boolean isInBonusCategory() {
        return this.category == BONUS_CATEGORY;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + " category=" + category + '}';
    }

}
