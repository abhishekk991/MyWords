package com.abhi.myWords.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWordsApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyWordsApplication.class, args);
		System.out.print("this is a spring boot application");
	}

}
