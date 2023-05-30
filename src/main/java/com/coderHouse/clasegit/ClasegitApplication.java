package com.coderHouse.clasegit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClasegitApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(ClasegitApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listining http://localhost:3000/h2-console");

	}
}
