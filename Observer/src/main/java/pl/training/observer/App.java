package pl.training.observer;

public class App {

    public static void main(String[] args) {
        MessageEmitter messageEmitter = new MessageEmitter();
        messageEmitter.attach(message -> System.out.println(message));

        messageEmitter.emit("Hello there!");
    }

}
