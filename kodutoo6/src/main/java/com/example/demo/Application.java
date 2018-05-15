package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	protected String isLeapYear;

	@RequestMapping("/leapyear")
	String leapYear(int year) {
		if ((year % 4) == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = "on";
				} else {
					isLeapYear = "ei ole";
				}
			} else {
				isLeapYear = "on";
			}
		} else {
			isLeapYear = "ei ole";
		}
		return "Tegu " + isLeapYear + " liigaastaga.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
