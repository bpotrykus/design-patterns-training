package pl.training.refactoring;

import static pl.szkolenie.Movie.*;

public class Starter {

    public static void main(String args[]){
        Customer customer = new Customer("Jan Kowalski");
        
        Movie movie = new Movie("Titanic", Category.REGULAR);
        Movie movie2 = new Movie("Rambo", Category.NEW_RELEASE);
        
        customer.addRental(new Rental(movie, 5));
        customer.addRental(new Rental(movie2, 15));
        
        Report<String> report = new TextReport(customer);

        System.out.println(report.create());
    }

}
