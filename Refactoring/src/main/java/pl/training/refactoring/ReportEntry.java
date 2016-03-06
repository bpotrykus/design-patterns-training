package pl.training.refactoring;

public class ReportEntry {

    private String title;
    private double charge;
    private int points;

    public ReportEntry(String title, double charge, int points) {
        this.title = title;
        this.charge = charge;
        this.points = points;
    }

    public double getCharge() {
        return charge;
    }

    public int getPoints() {
        return points;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ReportEntry{" + "title=" + title + " charge=" + charge + " points=" + points + '}';
    }

}
