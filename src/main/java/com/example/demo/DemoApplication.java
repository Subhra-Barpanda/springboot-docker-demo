package com.example.demo;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initialize(PersonRepository personRepository){
	    return (args) -> {
            Arrays.asList("Ram","Shyam","Vinod","Hari").forEach((name) -> {
                personRepository.save(new Person(name));
            });
        };
    }
}
