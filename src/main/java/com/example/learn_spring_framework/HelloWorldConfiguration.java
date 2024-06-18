package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String street, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Akshata";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 26);
	}
	
	@Bean
	public Person person2() {
		return new Person("Apeksha", 22);
	}
	
	@Bean
	public Address address() {
		return new Address("7th Street", "Bloomington");
	}
}
