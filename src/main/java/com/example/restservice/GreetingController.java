package com.example.restservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController


public class GreetingController {
    private static final String template = "Hello,%s!";

    //set the id for the greeting
    private final AtomicLong counter = new AtomicLong();

    //create single entry point for object
    //  /greeting?name=Dan
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}
