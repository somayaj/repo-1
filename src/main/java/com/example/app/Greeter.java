package com.example.app;

import org.springframework.stereotype.Service;

@Service
public class Greeter {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Welcome, " + name + "!";
    }

    public String farewell(String name) {
        if (name == null || name.isBlank()) {
            return "Farewell, dear friend!";
        }
        return "Farewell, " + name + ". Until we meet again!";
    }
}
