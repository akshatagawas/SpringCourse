package com.example.learn_spring_framework.test;

import java.io.Serializable;

//Plain Old Java Object
class Pojo{
	private String text;
	private int number;
	public String toString() {
		return text + ":" + number;
	}
}


//Java Bean 
class JavaBean implements Serializable{
	
	// public no-arg constructor
	public JavaBean() {
		
	}
	
	
	private String text;
	private int number;
	
	
	//getter and setters
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
}




public class SpringBeanVsJavaBean {

	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.println(pojo);

	}

}
