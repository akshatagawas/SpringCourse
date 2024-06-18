package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}
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
		return new Person("Ravi", 26, new Address("56th Street", "Chicago"));
	}
	
	@Bean(name = "person2")
	public Person person5() {
		return new Person("Apeksha", 22, new Address("67th Street", "San Francisco"));
	}
	
	@Bean
	public Person person3() {
		return new Person(name(), age(), address());
	}
	
	
	
	
	@Bean
	public Address address() {
		return new Address("7th Street", "Bloomington");
	}
	
	
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
}
