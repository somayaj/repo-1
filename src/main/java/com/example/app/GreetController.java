package com.example.app;

import java.time.Duration;
import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private final Greeter greeter;
    private final Instant startTime = Instant.now();

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

    @GetMapping("/version")
    public String version() {
        return "1.0.0";
    }

    @GetMapping("/goodbye")
    public String goodbye(@RequestParam(defaultValue = "") String name) {
        if (name.isBlank()) {
            return "Goodbye, World!";
        }
        return "Goodbye, " + name + "!";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String message) {
        return message;
    }

    @GetMapping("/timestamp")
    public String timestamp() {
        return Instant.now().toString();
    }

    @GetMapping("/login")
    public String login(@RequestParam String username) {
        return "Logged in as " + username;
    }
}
