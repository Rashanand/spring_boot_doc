package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NoStarterParentApplication {
	@GetMapping("/")
	public String getDescription() {
		return "Spring boot without starter parent";
	}
	public static void main(String[] args) {
		SpringApplication.run(NoStarterParentApplication.class, args);
	}

}
