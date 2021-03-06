package com.example.sencillo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SencilloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SencilloApplication.class, args);
	}
        
        @GetMapping("/")
        public String hello(@RequestParam(value = "name", defaultValue = "World") String nombre) {
                return String.format("Hola %s!", nombre);
                //http://localhost:8080/?name=esther
        }

}
