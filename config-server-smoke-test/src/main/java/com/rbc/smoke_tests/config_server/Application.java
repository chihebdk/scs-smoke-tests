package com.rbc.smoke_tests.config_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Application {


	@Value("${test.config.server:FAIL}")
	public String status;
	

	@RequestMapping("/check")
	public String check() {
		return status;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}
