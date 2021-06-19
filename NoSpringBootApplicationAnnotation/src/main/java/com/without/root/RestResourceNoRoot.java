package com.without.root;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResourceNoRoot {
	@GetMapping("/without/package")
	public String getDescription() {
		return "Without SpringBootApplication annotation. \nHaving root package.";
	}
}
