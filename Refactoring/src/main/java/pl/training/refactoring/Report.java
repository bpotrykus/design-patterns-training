package pl.training.refactoring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class Report<Type> {

    protected String customerName;
    protected double totalCharge;
    protected int renterPoints;
    protected Map<String, Double> chargesForMovies = new HashMap<String, Double>();

    public Report(Customer customer) {
        customerName = customer.getName();
        Collection<Rental> rentals = customer.getRentals();
        for (Rental rental : rentals) {        	
        	ReportEntry reportEntry = rental.generateReportEntry();
        	chargesForMovies.put(reportEntry.getTitle(), reportEntry.getCharge());
        	totalCharge += reportEntry.getCharge();
        	renterPoints += reportEntry.getPoints();
        }
    }

    public abstract Type create();
    
}
