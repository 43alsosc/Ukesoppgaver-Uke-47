package com.example.oppg2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FizzBuzzController {

    @GetMapping("/fizzbuzz")
    public List<String> getFizzBuzz() {
        List<String> fizzBuzzResult = new ArrayList<>();
        fizzBuzzResult.addAll(fizzBuzz());
        fizzBuzzResult.addAll(jazzFuzz());
        return fizzBuzzResult;
    }

    public List<String> fizzBuzz() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    result.add("Fizz Buzz");
                } else {
                    result.add("Fizz");
                }
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public List<String> jazzFuzz() {
        List<String> result = new ArrayList<>();
        for (int i = 100; i >= 1; i--) {
            if (i % 9 == 0) {
                if (i % 4 == 0) {
                    result.add("Jazz Fuzz");
                } else {
                    result.add("Jazz");
                }
            } else if (i % 4 == 0) {
                result.add("Fuzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}