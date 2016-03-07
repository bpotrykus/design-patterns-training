package pl.training.refactoring;

public class Movie {

    private String title;
    private int copies;
    private Gender gender = Gender.REGULAR;

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

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double calculateRent(int daysRent) {
        return gender.calculateRent(daysRent);
    }

}
