package com.example.app;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "name", "repo-1",
                "version", "1.0.0",
                "status", "running"
        );
    }
}
