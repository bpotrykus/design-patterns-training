package pl.training.spring;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void go() {
        engine.start();
        System.out.println("======================>");
    }

}
