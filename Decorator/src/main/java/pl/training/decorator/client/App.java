package pl.training.decorator.client;

import pl.training.decorator.MinMaxListDecorator;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);

        MinMaxListDecorator listDecorator = new MinMaxListDecorator(numbers);

        System.out.println(listDecorator.max());
        System.out.println(listDecorator.min());
    }

}
