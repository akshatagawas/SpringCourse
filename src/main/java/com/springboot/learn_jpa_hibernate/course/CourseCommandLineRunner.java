package com.springboot.learn_jpa_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn DevOps", "Baker Keith"));
		repository.insert(new Course(2, "Learn AWS", "Billy Grande"));
		repository.insert(new Course(3, "Learn AI", "Matthew Francisco"));
		repository.insert(new Course(4, "Learn React", "Anurag Bisht"));
		repository.insert(new Course(5, "Learn ML", "Keith Simmons"));
		repository.deleteById(3);
		
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(4));
		System.out.println(repository.findById(5));
	}

}
