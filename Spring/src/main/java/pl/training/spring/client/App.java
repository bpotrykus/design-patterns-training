package pl.training.spring.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.training.spring.Car;
import pl.training.spring.DieselEngine;
import pl.training.spring.Engine;
import pl.training.spring.PetrolEngine;

public class App {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")) {
            Car car = applicationContext.getBean(Car.class);
            car.go();
        }
    }

}
