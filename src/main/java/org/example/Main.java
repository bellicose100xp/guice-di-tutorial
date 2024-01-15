package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.module.GreeterModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GreeterModule());
        Greeter greeter = injector.getInstance(Greeter.class);
        greeter.sayHello();
    }
}
