package com.example.SpringBootJpa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.ControllerAdvice;


@SpringBootApplication(scanBasePackages = "com.example.SpringBootJpa")
@ControllerAdvice(basePackages = "com.example.SpringBootJpa")
@EnableJpaRepositories(basePackages = "com.example.SpringBootJpa.Repository")
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
