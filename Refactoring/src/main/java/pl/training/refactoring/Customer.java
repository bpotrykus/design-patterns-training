package pl.training.refactoring;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;

class Customer {

    private String name;
    private Collection<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void addRental(Rental rential) {
        rentals.add(rential);
    }
    
    public Collection<Rental> getRentals() {
    	return Collections.unmodifiableCollection(rentals);
    }
    
}
