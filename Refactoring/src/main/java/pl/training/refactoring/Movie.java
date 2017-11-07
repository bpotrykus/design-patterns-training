package pl.training.refactoring;

public class Movie {

    private String title;
    private int copies;
    private Gender gender = Gender.REGULAR;

    public Movie(String title) {
        this.title = title;
    }

    public void addCopy() {
        copies++;
    }

    public void removeCopy() {
        copies--;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getRentCosts(int daysRent) {
        return gender.getRentCosts(daysRent);
    }

    private boolean isAvailable() {
        return copies > 0;
    }

    public boolean rent() {
        if (isAvailable()) {
            removeCopy();
            return true;
        }
        return false;
    }

}
