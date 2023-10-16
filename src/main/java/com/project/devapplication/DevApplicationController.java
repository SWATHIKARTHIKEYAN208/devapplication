package com.project.devapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevApplicationController {
	@GetMapping(value="/get")
	public String get() {
		return "Swathi";
	}

}
