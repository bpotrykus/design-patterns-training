package pl.training.refactoring;

public enum Gender {

    REGULAR(2, 2, 1.5), NEW_RELEASE(0, 0, 3), CHILDREN(3, 1.5, 1.5);

    int minDaysRent;
    double initialCost;
    double costPerDay;

    Gender(int minDaysRent, double initialCost, double costPerDay) {
        this.minDaysRent = minDaysRent;
        this.initialCost = initialCost;
        this.costPerDay = costPerDay;
    }

    public double calculateRent(int rentDays) {
        double totalCost = initialCost;
        int days = rentDays - minDaysRent;
        if (days > 0) {
            totalCost += days * costPerDay;
        }
        return totalCost;
    }

}
