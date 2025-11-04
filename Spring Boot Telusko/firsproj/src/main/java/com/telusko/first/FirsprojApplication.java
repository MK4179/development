package com.telusko.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirsprojApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirsprojApplication.class, args);
	
			Alien obj = context.getBean(Alien.class);
			obj.code();
	}

}
