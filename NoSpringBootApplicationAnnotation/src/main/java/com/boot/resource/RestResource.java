package com.boot.resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResource {
	@GetMapping("/with/package")
	public String getDescription() {
		return "With SpringBootApplication annotation. \nHaving root package.";
	}
}
