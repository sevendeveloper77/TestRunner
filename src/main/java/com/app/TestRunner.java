package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.one.Customer;
import com.app.one.Product;

@SpringBootApplication
public class TestRunner implements CommandLineRunner {

	@Autowired
	private Product p;
	
	@Autowired
	private Customer c;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(p);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestRunner.class, args);
	}

}
