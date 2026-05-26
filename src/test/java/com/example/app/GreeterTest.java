package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    private final Greeter greeter = new Greeter();

    @Test
    void greetWithName() {
        assertEquals("Hello, Alice!", greeter.greet("Alice"));
    }

    @Test
    void greetWithNull() {
        assertEquals("Hello, World!", greeter.greet(null));
    }

    @Test
    void greetWithBlank() {
        assertEquals("Hello, World!", greeter.greet("   "));
    }
}
