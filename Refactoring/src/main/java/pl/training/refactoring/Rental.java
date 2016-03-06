package pl.training.refactoring;

class Rental {

    private static final int DEFAULT_RENTAL_POINTS = 1;
    private static final int BONUS_RENTAL_POINTS = 1;
    
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    private double calculateCharge() {
        double charge = 0;
        switch (movie.getCategory()) {
            case REGULAR:
                charge += 2;
                if (daysRented > 2) {
                    charge += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                charge += daysRented * 3;
                break;
            case CHILDREN:
                charge += 1.5;
                if (daysRented > 3) {
                    charge += (daysRented - 3) * 1.5;
                }
                break;
        }
        return charge;
    }

    private int calculateRentalPoints() {
        if (movie.isInBonusCategory() && daysRented > 1) {
            return DEFAULT_RENTAL_POINTS + BONUS_RENTAL_POINTS;
        }
        return DEFAULT_RENTAL_POINTS;
    }

    public ReportEntry generateReportEntry() {
        return new ReportEntry(movie.getTitle(), calculateCharge(), calculateRentalPoints());
    }

    @Override
    public String toString() {
        return "Rental{" + "movie=" + movie + " daysRented=" + daysRented + '}';
    }
    
}
