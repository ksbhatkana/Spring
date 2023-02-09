package com.ksbhat.funprojecton3layers;

import com.ksbhat.funprojecton3layers.controller.ExampleController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class FunProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = run(FunProjectApplication.class, args);

		ExampleController exampleController = context.getBean(ExampleController.class);
		exampleController.displaySum();

	}

}
