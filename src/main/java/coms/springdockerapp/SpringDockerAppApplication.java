package coms.springdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerAppApplication.class, args);
		System.out.println("Hello Docker");
	}
}
