package com.ksbhat.funproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class FunProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = run(FunProjectApplication.class, args);

		GamingRunner runner = context.getBean(GamingRunner.class);
		runner.run();

	}

}
