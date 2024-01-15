package org.example;

import com.google.inject.Inject;
import org.example.annotation.Count;
import org.example.annotation.Message;

public class Greeter {
    private final String message;
    private final int count;

    @Inject
    public Greeter(@Message String message, @Count int count) {
        this.message = message;
        this.count = count;
    }

    public void sayHello() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
