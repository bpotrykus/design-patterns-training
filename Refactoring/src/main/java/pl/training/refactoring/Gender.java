package pl.training.refactoring;

public enum Gender {

    REGULAR(2, 2, 1.5), NEW_RELEASE(0, 0, 3), CHILDREN(3, 1.5, 1.5);

    private int freeRentalPeriod;
    private double initialCost;
    private double costPerDay;

    Gender(int freeRentalPeriod, double initialCost, double costPerDay) {
        this.freeRentalPeriod = freeRentalPeriod;
        this.initialCost = initialCost;
        this.costPerDay = costPerDay;
    }

    public double getRentCosts(int rentDays) {
        double rentCosts = getPaidDays(rentDays) * costPerDay;
        return initialCost + rentCosts;
    }

    private int getPaidDays(int rentDays) {
        return rentDays - freeRentalPeriod;
    }

}
