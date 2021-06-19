package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.boot","com.without.root"})
@EnableAutoConfiguration
public class NoSpringBootApplicationAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoSpringBootApplicationAnnotationApplication.class, args);
	}

}
