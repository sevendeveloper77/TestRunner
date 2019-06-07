package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.one.Customer;

@Configuration
public class NewConfig {
	@Bean
	public Customer cob() {
	System.out.println("NewConfig load");
	Customer c = new Customer();
	c.setCustId(8888);
	return c;
	}
}
