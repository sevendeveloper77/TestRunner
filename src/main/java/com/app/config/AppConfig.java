package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.one.Product;

@Configuration
public class AppConfig {
	    @Bean
	    public Product pob() {
	    System.out.println("AppConfig load");
		Product p = new Product();
		p.setPrdId(999);
		System.out.println("done");
	    return p;
	}

}
