package com.brunofelixdev.vendasapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApiApplication {

//	@Autowired
//	@Qualifier(value = "appName")	// Injeta nessa String o Bean de nome 'appName'
	@Value("${application.name}")	// Pega do arquivo application.propertie
	private String appName;

	@GetMapping(path = "/hello")
	public String hello() {
		return this.appName;
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApiApplication.class, args);
	}

}
