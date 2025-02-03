package com.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Check {
    @GetMapping()
    public String getGreeting() {
        return "Hi, Prateek Kesharwani";
    }
}
