package com.example.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//THIS part sets the starting point for the application
@SpringBootApplication
public class JavaBrainsProjectApplication {
	// host the application in the server container, the first argument it takes is the
	// class JavaBrainsProjectApplication.class
	public static void main(String[] args) {
		SpringApplication.run(JavaBrainsProjectApplication.class, args);
	}
}
