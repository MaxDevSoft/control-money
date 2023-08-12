package com.maxdevsoft.controlmoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // classe do tipo controller
public class ControlMoneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlMoneyApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){

		return "Hello word";
	}
}
