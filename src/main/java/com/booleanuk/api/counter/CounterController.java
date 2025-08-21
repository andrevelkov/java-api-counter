package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterController {

    int counter = 0;

    @GetMapping
    public String getCounterValue() {
        return "Counter Value: " + counter;
    }

    @GetMapping("/increment")
    public String incrementCounter() {
        counter = counter + 1;
        return "Counter Value: " + counter;
    }

    @GetMapping("/decrement")
    public String decrementCounter() {
        counter = counter - 1;
        return "Counter Value: " + counter;
    }

}
