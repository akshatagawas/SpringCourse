package com.example.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	@Primary
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
	@Primary
	public Address address() {
		return new Address("7th Street", "Bloomington");
	}
	
	@Bean(name = "address2")
	@Qualifier("address2qualifier")
	public Address address2() {
		return new Address("62th Street", "Mumbai");
	}
	
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Parameters(String name, int age, @Qualifier("address2qualifier") Address address) {
		return new Person(name, age, address);
	}
}
