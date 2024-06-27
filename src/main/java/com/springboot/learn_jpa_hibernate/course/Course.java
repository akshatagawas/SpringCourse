package com.springboot.learn_jpa_hibernate.course;

public class Course {
	private long id;
	private String name;
	private String author;
	
	
	// Constructors
	public Course () {
		
	}

	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}






	// Getters
	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}



	// ToString

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
