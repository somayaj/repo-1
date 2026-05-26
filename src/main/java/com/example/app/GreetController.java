package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private final Greeter greeter;

    public GreetController(Greeter greeter) {
        this.greeter = greeter;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "") String name) {
        return greeter.greet(name);
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
