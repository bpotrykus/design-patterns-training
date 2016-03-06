package pl.training.refactoring;

import java.util.Map.Entry;

public class TextReport extends Report<String> {
	
	private static final String LINE_BREAK = System.getProperty("line.separator");

	public TextReport(Customer customer) {
		super(customer);
	}

	@Override
	public String create() {
        StringBuilder result = new StringBuilder();
        addTitle(result);
        addEntries(result);
        addSummary(result);
        return result.toString();
	}
	
    private void addTitle(StringBuilder result) {
    	result.append("Rental Record for ").append(customerName).append(LINE_BREAK);
    }
    
    private void addEntries(StringBuilder result) {
        for (Entry<String, Double> entry : chargesForMovies.entrySet()) {
            result.append(entry.getKey()).append(" ").append(entry.getValue()).append(LINE_BREAK);
        }    	
    }
    
    private void addSummary(StringBuilder result) {
        result.append("Amount owed is ").append(totalCharge).append(LINE_BREAK)
        	.append("You earned ").append(renterPoints).append(" frequent renter points").append(LINE_BREAK);    	
    }

}
