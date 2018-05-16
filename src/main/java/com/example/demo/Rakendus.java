package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Rakendus {
    @RequestMapping("/ruut")
    int square(int arv) {
        int result = arv * arv;
        return result;
    }

    public static void main(String[] args) {
        SpringApplication.run(Rakendus.class, args);
    }
}
/*
https://kodutoo6springboot.herokuapp.com/
*/

