package pl.training.proxy.client;

import pl.training.proxy.WriterLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App {

    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("data.txt")) {
            Writer writerApi = writer;
            writerApi = new WriterLogger(writer);
            writerApi.write("Test entry");
        }
    }

}
