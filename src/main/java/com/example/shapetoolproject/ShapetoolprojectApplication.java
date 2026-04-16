package com.example.shapetoolproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShapetoolprojectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShapetoolprojectApplication.class, args);
		System.out.println("========================================");
		System.out.println("ShapeTool SOAP Service is Running!");
		System.out.println("WSDL: http://localhost:8080/ws/shapes.wsdl");
		System.out.println("========================================");
	}
}